// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListLogContentsRequest} extends {@link RequestModel}
 *
 * <p>ListLogContentsRequest</p>
 */
public class ListLogContentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("length")
    private Integer length;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ListLogContentsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.fileName = builder.fileName;
        this.length = builder.length;
        this.offset = builder.offset;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogContentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListLogContentsRequest, Builder> {
        private String workspaceId; 
        private String fileName; 
        private Integer length; 
        private Integer offset; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListLogContentsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.fileName = request.fileName;
            this.length = request.length;
            this.offset = request.offset;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * length.
         */
        public Builder length(Integer length) {
            this.putQueryParameter("length", length);
            this.length = length;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListLogContentsRequest build() {
            return new ListLogContentsRequest(this);
        } 

    } 

}
