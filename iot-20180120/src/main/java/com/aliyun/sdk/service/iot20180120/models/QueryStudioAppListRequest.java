// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStudioAppListRequest} extends {@link RequestModel}
 *
 * <p>QueryStudioAppListRequest</p>
 */
public class QueryStudioAppListRequest extends Request {
    @Body
    @NameInMap("FuzzyName")
    private String fuzzyName;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("PageNo")
    private Integer pageNo;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("Types")
    @Validation(required = true)
    private java.util.List < String > types;

    private QueryStudioAppListRequest(Builder builder) {
        super(builder);
        this.fuzzyName = builder.fuzzyName;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStudioAppListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fuzzyName
     */
    public String getFuzzyName() {
        return this.fuzzyName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
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

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<QueryStudioAppListRequest, Builder> {
        private String fuzzyName; 
        private String iotInstanceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String projectId; 
        private java.util.List < String > types; 

        private Builder() {
            super();
        } 

        private Builder(QueryStudioAppListRequest request) {
            super(request);
            this.fuzzyName = request.fuzzyName;
            this.iotInstanceId = request.iotInstanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.types = request.types;
        } 

        /**
         * FuzzyName.
         */
        public Builder fuzzyName(String fuzzyName) {
            this.putBodyParameter("FuzzyName", fuzzyName);
            this.fuzzyName = fuzzyName;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(java.util.List < String > types) {
            this.putBodyParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public QueryStudioAppListRequest build() {
            return new QueryStudioAppListRequest(this);
        } 

    } 

}
