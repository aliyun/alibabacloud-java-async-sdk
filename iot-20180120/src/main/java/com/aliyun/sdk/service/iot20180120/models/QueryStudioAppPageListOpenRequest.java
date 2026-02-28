// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryStudioAppPageListOpenRequest} extends {@link RequestModel}
 *
 * <p>QueryStudioAppPageListOpenRequest</p>
 */
public class QueryStudioAppPageListOpenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsRelease")
    private Boolean isRelease;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private QueryStudioAppPageListOpenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.iotInstanceId = builder.iotInstanceId;
        this.isRelease = builder.isRelease;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStudioAppPageListOpenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return isRelease
     */
    public Boolean getIsRelease() {
        return this.isRelease;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<QueryStudioAppPageListOpenRequest, Builder> {
        private String appId; 
        private String iotInstanceId; 
        private Boolean isRelease; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(QueryStudioAppPageListOpenRequest request) {
            super(request);
            this.appId = request.appId;
            this.iotInstanceId = request.iotInstanceId;
            this.isRelease = request.isRelease;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a12*******</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * IsRelease.
         */
        public Builder isRelease(Boolean isRelease) {
            this.putBodyParameter("IsRelease", isRelease);
            this.isRelease = isRelease;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a12******</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public QueryStudioAppPageListOpenRequest build() {
            return new QueryStudioAppPageListOpenRequest(this);
        } 

    } 

}
