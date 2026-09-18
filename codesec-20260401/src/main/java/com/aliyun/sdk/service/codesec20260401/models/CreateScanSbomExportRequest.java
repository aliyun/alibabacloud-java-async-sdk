// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link CreateScanSbomExportRequest} extends {@link RequestModel}
 *
 * <p>CreateScanSbomExportRequest</p>
 */
public class CreateScanSbomExportRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scanId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("format")
    @com.aliyun.core.annotation.Validation(required = true)
    private String format;

    private CreateScanSbomExportRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.scanId = builder.scanId;
        this.regionId = builder.regionId;
        this.fileName = builder.fileName;
        this.format = builder.format;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanSbomExportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return scanId
     */
    public Long getScanId() {
        return this.scanId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    public static final class Builder extends Request.Builder<CreateScanSbomExportRequest, Builder> {
        private Long projectId; 
        private Long scanId; 
        private String regionId; 
        private String fileName; 
        private String format; 

        private Builder() {
            super();
        } 

        private Builder(CreateScanSbomExportRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.scanId = request.scanId;
            this.regionId = request.regionId;
            this.fileName = request.fileName;
            this.format = request.format;
        } 

        /**
         * <p>Numeric primary key (<code>projects.id</code>).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder projectId(Long projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Numeric primary key (<code>scans.id</code>).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3088795</p>
         */
        public Builder scanId(Long scanId) {
            this.putPathParameter("scanId", scanId);
            this.scanId = scanId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>选填。指定下载落盘的文件名（含扩展名），会签进下载地址的 Content-Disposition。
         * 留空时后端按 <code>项目名-sbom-&lt;format&gt;.&lt;扩展名&gt;</code> 生成默认值。
         * 不得含控制字符或路径分隔符（<code>/</code>、<code>\</code>）、长度不超过 255，否则 → 400 <strong><code>InvalidFileName</code></strong>。</p>
         * 
         * <strong>example:</strong>
         * <p>test-sbom-cyclonedx.cdx.json</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>闭合枚举，须是该次扫描 <strong><code>artifacts</code></strong> 里 <strong><code>status=success</code></strong> 的 <strong><code>artifact_kind</code></strong>。
         * 未知值 → 400 <strong><code>InvalidArtifactFormat</code></strong>，且绝不参与 OSS key 构造。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cyclonedx-json</p>
         */
        public Builder format(String format) {
            this.putQueryParameter("format", format);
            this.format = format;
            return this;
        }

        @Override
        public CreateScanSbomExportRequest build() {
            return new CreateScanSbomExportRequest(this);
        } 

    } 

}
