// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySolutionDeviceGroupPageRequest} extends {@link RequestModel}
 *
 * <p>QuerySolutionDeviceGroupPageRequest</p>
 */
public class QuerySolutionDeviceGroupPageRequest extends Request {
    @Query
    @NameInMap("FuzzyGroupName")
    private String fuzzyGroupName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageId")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer pageId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProjectCode")
    @Validation(required = true)
    private String projectCode;

    private QuerySolutionDeviceGroupPageRequest(Builder builder) {
        super(builder);
        this.fuzzyGroupName = builder.fuzzyGroupName;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.projectCode = builder.projectCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySolutionDeviceGroupPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fuzzyGroupName
     */
    public String getFuzzyGroupName() {
        return this.fuzzyGroupName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageId
     */
    public Integer getPageId() {
        return this.pageId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    public static final class Builder extends Request.Builder<QuerySolutionDeviceGroupPageRequest, Builder> {
        private String fuzzyGroupName; 
        private String iotInstanceId; 
        private Integer pageId; 
        private Integer pageSize; 
        private String projectCode; 

        private Builder() {
            super();
        } 

        private Builder(QuerySolutionDeviceGroupPageRequest request) {
            super(request);
            this.fuzzyGroupName = request.fuzzyGroupName;
            this.iotInstanceId = request.iotInstanceId;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.projectCode = request.projectCode;
        } 

        /**
         * FuzzyGroupName.
         */
        public Builder fuzzyGroupName(String fuzzyGroupName) {
            this.putQueryParameter("FuzzyGroupName", fuzzyGroupName);
            this.fuzzyGroupName = fuzzyGroupName;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * PageId.
         */
        public Builder pageId(Integer pageId) {
            this.putQueryParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectCode.
         */
        public Builder projectCode(String projectCode) {
            this.putQueryParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        @Override
        public QuerySolutionDeviceGroupPageRequest build() {
            return new QuerySolutionDeviceGroupPageRequest(this);
        } 

    } 

}
