// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitVideoAuditRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoAuditRequest</p>
 */
public class SubmitVideoAuditRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ext")
    private String ext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SnapshotInterval")
    private Double snapshotInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitVideoAuditRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ext = builder.ext;
        this.fileKey = builder.fileKey;
        this.snapshotInterval = builder.snapshotInterval;
        this.url = builder.url;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoAuditRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return snapshotInterval
     */
    public Double getSnapshotInterval() {
        return this.snapshotInterval;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitVideoAuditRequest, Builder> {
        private String regionId; 
        private String ext; 
        private String fileKey; 
        private Double snapshotInterval; 
        private String url; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoAuditRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ext = request.ext;
            this.fileKey = request.fileKey;
            this.snapshotInterval = request.snapshotInterval;
            this.url = request.url;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>扩展参数JSON字符串</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder ext(String ext) {
            this.putBodyParameter("Ext", ext);
            this.ext = ext;
            return this;
        }

        /**
         * <p>OSS文件Key，与url参数二选一</p>
         * 
         * <strong>example:</strong>
         * <p>video/test.mp4</p>
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * <p>抽帧间隔时间（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder snapshotInterval(Double snapshotInterval) {
            this.putBodyParameter("SnapshotInterval", snapshotInterval);
            this.snapshotInterval = snapshotInterval;
            return this;
        }

        /**
         * <p>视频URL地址，与fileKey参数二选一</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/video.mp4">https://example.com/video.mp4</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitVideoAuditRequest build() {
            return new SubmitVideoAuditRequest(this);
        } 

    } 

}
