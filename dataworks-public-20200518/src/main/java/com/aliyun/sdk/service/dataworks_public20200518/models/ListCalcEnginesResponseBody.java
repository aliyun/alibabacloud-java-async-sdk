// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCalcEnginesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCalcEnginesResponseBody</p>
 */
public class ListCalcEnginesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCalcEnginesResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCalcEnginesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCalcEnginesResponseBody build() {
            return new ListCalcEnginesResponseBody(this);
        } 

    } 

    public static class CalcEngines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingProjectId")
        private Integer bindingProjectId;

        @com.aliyun.core.annotation.NameInMap("BindingProjectName")
        private String bindingProjectName;

        @com.aliyun.core.annotation.NameInMap("CalcEngineType")
        private String calcEngineType;

        @com.aliyun.core.annotation.NameInMap("DwRegion")
        private String dwRegion;

        @com.aliyun.core.annotation.NameInMap("EngineId")
        private Integer engineId;

        @com.aliyun.core.annotation.NameInMap("EngineInfo")
        private java.util.Map < String, ? > engineInfo;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("TaskAuthType")
        private String taskAuthType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private CalcEngines(Builder builder) {
            this.bindingProjectId = builder.bindingProjectId;
            this.bindingProjectName = builder.bindingProjectName;
            this.calcEngineType = builder.calcEngineType;
            this.dwRegion = builder.dwRegion;
            this.engineId = builder.engineId;
            this.engineInfo = builder.engineInfo;
            this.envType = builder.envType;
            this.gmtCreate = builder.gmtCreate;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.region = builder.region;
            this.taskAuthType = builder.taskAuthType;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalcEngines create() {
            return builder().build();
        }

        /**
         * @return bindingProjectId
         */
        public Integer getBindingProjectId() {
            return this.bindingProjectId;
        }

        /**
         * @return bindingProjectName
         */
        public String getBindingProjectName() {
            return this.bindingProjectName;
        }

        /**
         * @return calcEngineType
         */
        public String getCalcEngineType() {
            return this.calcEngineType;
        }

        /**
         * @return dwRegion
         */
        public String getDwRegion() {
            return this.dwRegion;
        }

        /**
         * @return engineId
         */
        public Integer getEngineId() {
            return this.engineId;
        }

        /**
         * @return engineInfo
         */
        public java.util.Map < String, ? > getEngineInfo() {
            return this.engineInfo;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return taskAuthType
         */
        public String getTaskAuthType() {
            return this.taskAuthType;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Integer bindingProjectId; 
            private String bindingProjectName; 
            private String calcEngineType; 
            private String dwRegion; 
            private Integer engineId; 
            private java.util.Map < String, ? > engineInfo; 
            private String envType; 
            private String gmtCreate; 
            private Boolean isDefault; 
            private String name; 
            private String region; 
            private String taskAuthType; 
            private Long tenantId; 

            /**
             * BindingProjectId.
             */
            public Builder bindingProjectId(Integer bindingProjectId) {
                this.bindingProjectId = bindingProjectId;
                return this;
            }

            /**
             * BindingProjectName.
             */
            public Builder bindingProjectName(String bindingProjectName) {
                this.bindingProjectName = bindingProjectName;
                return this;
            }

            /**
             * CalcEngineType.
             */
            public Builder calcEngineType(String calcEngineType) {
                this.calcEngineType = calcEngineType;
                return this;
            }

            /**
             * DwRegion.
             */
            public Builder dwRegion(String dwRegion) {
                this.dwRegion = dwRegion;
                return this;
            }

            /**
             * EngineId.
             */
            public Builder engineId(Integer engineId) {
                this.engineId = engineId;
                return this;
            }

            /**
             * EngineInfo.
             */
            public Builder engineInfo(java.util.Map < String, ? > engineInfo) {
                this.engineInfo = engineInfo;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * TaskAuthType.
             */
            public Builder taskAuthType(String taskAuthType) {
                this.taskAuthType = taskAuthType;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public CalcEngines build() {
                return new CalcEngines(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalcEngines")
        private java.util.List < CalcEngines> calcEngines;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.calcEngines = builder.calcEngines;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return calcEngines
         */
        public java.util.List < CalcEngines> getCalcEngines() {
            return this.calcEngines;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < CalcEngines> calcEngines; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * CalcEngines.
             */
            public Builder calcEngines(java.util.List < CalcEngines> calcEngines) {
                this.calcEngines = calcEngines;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
