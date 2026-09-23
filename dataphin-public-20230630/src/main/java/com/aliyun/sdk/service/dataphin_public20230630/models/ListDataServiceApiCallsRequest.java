// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListDataServiceApiCallsRequest} extends {@link RequestModel}
 *
 * <p>ListDataServiceApiCallsRequest</p>
 */
public class ListDataServiceApiCallsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer projectId;

    private ListDataServiceApiCallsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceApiCallsRequest create() {
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
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return projectId
     */
    public Integer getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListDataServiceApiCallsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 
        private Integer projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataServiceApiCallsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.projectId = request.projectId;
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
         * <p>The query conditions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The ID of the data service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102102</p>
         */
        public Builder projectId(Integer projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListDataServiceApiCallsRequest build() {
            return new ListDataServiceApiCallsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceApiCallsRequest} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiCallsRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        @Deprecated
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("AppKeyStr")
        private String appKeyStr;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Successful")
        private Boolean successful;

        private ListQuery(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.appKey = builder.appKey;
            this.appKeyStr = builder.appKeyStr;
            this.clientIp = builder.clientIp;
            this.endTime = builder.endTime;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.startTime = builder.startTime;
            this.successful = builder.successful;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return appKeyStr
         */
        public String getAppKeyStr() {
            return this.appKeyStr;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return successful
         */
        public Boolean getSuccessful() {
            return this.successful;
        }

        public static final class Builder {
            private Long apiId; 
            private String apiName; 
            private Long appKey; 
            private String appKeyStr; 
            private String clientIp; 
            private String endTime; 
            private Integer pageNo; 
            private Integer pageSize; 
            private String startTime; 
            private Boolean successful; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.appKey = model.appKey;
                this.appKeyStr = model.appKeyStr;
                this.clientIp = model.clientIp;
                this.endTime = model.endTime;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.startTime = model.startTime;
                this.successful = model.successful;
            } 

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>20122</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The application key.</p>
             * <blockquote>
             * <p>Notice: This parameter is deprecated. Use AppKeyStr instead.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The application key.</p>
             * 
             * <strong>example:</strong>
             * <p>app12345</p>
             */
            public Builder appKeyStr(String appKeyStr) {
                this.appKeyStr = appKeyStr;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The end time. Format: yyyy-MM-dd HH:mm:ss.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 20:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The start time. Format: yyyy-MM-dd HH:mm:ss.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 08:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Indicates whether the call was successful.</p>
             */
            public Builder successful(Boolean successful) {
                this.successful = successful;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
