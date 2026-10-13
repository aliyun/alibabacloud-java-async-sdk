// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetMigrateApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetMigrateApplicationResponseBody</p>
 */
public class GetMigrateApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private GetMigrateApplicationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrateApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(GetMigrateApplicationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3b52155517851187240212426d0099</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetMigrateApplicationResponseBody build() {
            return new GetMigrateApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMigrateApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrateApplicationResponseBody</p>
     */
    public static class ExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appJsonFile")
        private String appJsonFile;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        private ExtraInfo(Builder builder) {
            this.appJsonFile = builder.appJsonFile;
            this.errorMsg = builder.errorMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return appJsonFile
         */
        public String getAppJsonFile() {
            return this.appJsonFile;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public static final class Builder {
            private String appJsonFile; 
            private String errorMsg; 

            private Builder() {
            } 

            private Builder(ExtraInfo model) {
                this.appJsonFile = model.appJsonFile;
                this.errorMsg = model.errorMsg;
            } 

            /**
             * <p>appJsonFile</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;<a href="https://edas-hz-secure.oss-cn-hangzhou.aliyuncs.com/edas-app-migration/1057288613002791/e7c2e7d9-5e87-46a2-99e9-2be0b577a3fd/edas-app.json?Expires=1791517039&OSSAccessKeyId=LTAIWLbjtAGvdMWX&Signature=HyZ2b3u5mlP56T8QgkARwWE5cQc%3D">https://edas-hz-secure.oss-cn-hangzhou.aliyuncs.com/edas-app-migration/1057288613002791/e7c2e7d9-5e87-46a2-99e9-2be0b577a3fd/edas-app.json?Expires=1791517039&amp;OSSAccessKeyId=LTAIWLbjtAGvdMWX&amp;Signature=HyZ2b3u5mlP56T8QgkARwWE5cQc%3D</a>&quot;</p>
             */
            public Builder appJsonFile(String appJsonFile) {
                this.appJsonFile = appJsonFile;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMigrateApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrateApplicationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appDetailState")
        private String appDetailState;

        @com.aliyun.core.annotation.NameInMap("binaryCleaned")
        private Long binaryCleaned;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("extraInfo")
        private ExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("migrationId")
        private String migrationId;

        @com.aliyun.core.annotation.NameInMap("migrationType")
        private Long migrationType;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("statePercent")
        private String statePercent;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private Result(Builder builder) {
            this.appDetailState = builder.appDetailState;
            this.binaryCleaned = builder.binaryCleaned;
            this.createTime = builder.createTime;
            this.extraInfo = builder.extraInfo;
            this.migrationId = builder.migrationId;
            this.migrationType = builder.migrationType;
            this.owner = builder.owner;
            this.regionId = builder.regionId;
            this.state = builder.state;
            this.statePercent = builder.statePercent;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appDetailState
         */
        public String getAppDetailState() {
            return this.appDetailState;
        }

        /**
         * @return binaryCleaned
         */
        public Long getBinaryCleaned() {
            return this.binaryCleaned;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return migrationId
         */
        public String getMigrationId() {
            return this.migrationId;
        }

        /**
         * @return migrationType
         */
        public Long getMigrationType() {
            return this.migrationType;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return statePercent
         */
        public String getStatePercent() {
            return this.statePercent;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String appDetailState; 
            private Long binaryCleaned; 
            private Long createTime; 
            private ExtraInfo extraInfo; 
            private String migrationId; 
            private Long migrationType; 
            private String owner; 
            private String regionId; 
            private String state; 
            private String statePercent; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.appDetailState = model.appDetailState;
                this.binaryCleaned = model.binaryCleaned;
                this.createTime = model.createTime;
                this.extraInfo = model.extraInfo;
                this.migrationId = model.migrationId;
                this.migrationType = model.migrationType;
                this.owner = model.owner;
                this.regionId = model.regionId;
                this.state = model.state;
                this.statePercent = model.statePercent;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The detailed status of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;a259bc63-c1f4-48ba-89b1-d6a4591e946c\&quot;:{\&quot;app_name\&quot;:\&quot;prodoam1\&quot;,\&quot;cluster_name\&quot;:\&quot;hthoamtest\&quot;,\&quot;cluster_id\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;error_msg\&quot;:\&quot;\&quot;,\&quot;is_multilingual_app\&quot;:false,\&quot;state\&quot;:\&quot;success\&quot;,\&quot;clusterId\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;app_id\&quot;:\&quot;a259bc63-c1f4-48ba-89b1-d6a4591e946c\&quot;,\&quot;logical_region_id\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;k8sNamespace\&quot;:\&quot;default\&quot;},\&quot;c5a258ac-f02d-4035-b59f-cd7f4a34156a\&quot;:{\&quot;app_name\&quot;:\&quot;testoam1\&quot;,\&quot;cluster_name\&quot;:\&quot;hthoamtest\&quot;,\&quot;cluster_id\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;error_msg\&quot;:\&quot;\&quot;,\&quot;is_multilingual_app\&quot;:false,\&quot;state\&quot;:\&quot;success\&quot;,\&quot;clusterId\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;app_id\&quot;:\&quot;c5a258ac-f02d-4035-b59f-cd7f4a34156a\&quot;,\&quot;logical_region_id\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;k8sNamespace\&quot;:\&quot;default\&quot;},\&quot;d132c827-db2f-444e-bc9e-9182d8112806\&quot;:{\&quot;app_name\&quot;:\&quot;oam1\&quot;,\&quot;cluster_name\&quot;:\&quot;hthoamtest\&quot;,\&quot;cluster_id\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;error_msg\&quot;:\&quot;\&quot;,\&quot;is_multilingual_app\&quot;:false,\&quot;state\&quot;:\&quot;success\&quot;,\&quot;clusterId\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;app_id\&quot;:\&quot;d132c827-db2f-444e-bc9e-9182d8112806\&quot;,\&quot;logical_region_id\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;k8sNamespace\&quot;:\&quot;default\&quot;}}&quot;</p>
             */
            public Builder appDetailState(String appDetailState) {
                this.appDetailState = appDetailState;
                return this;
            }

            /**
             * <p>Indicates whether binary resources are cleaned up. Valid values: 0: not cleaned up. 1: cleaned up.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder binaryCleaned(Long binaryCleaned) {
                this.binaryCleaned = binaryCleaned;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1791512615778</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The additional information.</p>
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The migration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;e7c2e7d9-5e87-46a2-99e9-2be0b577a3fd&quot;</p>
             */
            public Builder migrationId(String migrationId) {
                this.migrationId = migrationId;
                return this;
            }

            /**
             * <p>The operation type of the migration task. Valid values: 1: import. 2: export. 3: clone.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder migrationType(Long migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * <p>The executor.</p>
             * 
             * <strong>example:</strong>
             * <p>lvwan</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>regionId</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The application migration status. Valid values: failed: Failed. finished: Succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>finished</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The task progress percentage, stored as a floating-point number. For example, if the API returns 0.33, the progress bar displays 33%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.33</p>
             */
            public Builder statePercent(String statePercent) {
                this.statePercent = statePercent;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1791512615778</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMigrateApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrateApplicationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Long currentPage; 
            private Long pageSize; 
            private java.util.List<Result> result; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.result = model.result;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of results.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
