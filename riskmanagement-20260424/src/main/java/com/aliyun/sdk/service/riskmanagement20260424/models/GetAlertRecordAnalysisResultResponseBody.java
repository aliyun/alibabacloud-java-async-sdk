// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetAlertRecordAnalysisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlertRecordAnalysisResultResponseBody</p>
 */
public class GetAlertRecordAnalysisResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAlertRecordAnalysisResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertRecordAnalysisResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAlertRecordAnalysisResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetAlertRecordAnalysisResultResponseBody build() {
            return new GetAlertRecordAnalysisResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlertRecordAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRecordAnalysisResultResponseBody</p>
     */
    public static class UniqueTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("AnalysisCode")
        private String analysisCode;

        @com.aliyun.core.annotation.NameInMap("AnalysisResult")
        private String analysisResult;

        @com.aliyun.core.annotation.NameInMap("ChooseLike")
        private Boolean chooseLike;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("MachineInstanceId")
        private String machineInstanceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UniqueInfo")
        private String uniqueInfo;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private UniqueTagList(Builder builder) {
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.aliUid = builder.aliUid;
            this.analysisCode = builder.analysisCode;
            this.analysisResult = builder.analysisResult;
            this.chooseLike = builder.chooseLike;
            this.ip = builder.ip;
            this.machineInstanceId = builder.machineInstanceId;
            this.type = builder.type;
            this.uniqueInfo = builder.uniqueInfo;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UniqueTagList create() {
            return builder().build();
        }

        /**
         * @return alarmUniqueInfo
         */
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return analysisCode
         */
        public String getAnalysisCode() {
            return this.analysisCode;
        }

        /**
         * @return analysisResult
         */
        public String getAnalysisResult() {
            return this.analysisResult;
        }

        /**
         * @return chooseLike
         */
        public Boolean getChooseLike() {
            return this.chooseLike;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return machineInstanceId
         */
        public String getMachineInstanceId() {
            return this.machineInstanceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uniqueInfo
         */
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String alarmUniqueInfo; 
            private String aliUid; 
            private String analysisCode; 
            private String analysisResult; 
            private Boolean chooseLike; 
            private String ip; 
            private String machineInstanceId; 
            private String type; 
            private String uniqueInfo; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(UniqueTagList model) {
                this.alarmUniqueInfo = model.alarmUniqueInfo;
                this.aliUid = model.aliUid;
                this.analysisCode = model.analysisCode;
                this.analysisResult = model.analysisResult;
                this.chooseLike = model.chooseLike;
                this.ip = model.ip;
                this.machineInstanceId = model.machineInstanceId;
                this.type = model.type;
                this.uniqueInfo = model.uniqueInfo;
                this.uuid = model.uuid;
            } 

            /**
             * AlarmUniqueInfo.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * AnalysisCode.
             */
            public Builder analysisCode(String analysisCode) {
                this.analysisCode = analysisCode;
                return this;
            }

            /**
             * AnalysisResult.
             */
            public Builder analysisResult(String analysisResult) {
                this.analysisResult = analysisResult;
                return this;
            }

            /**
             * ChooseLike.
             */
            public Builder chooseLike(Boolean chooseLike) {
                this.chooseLike = chooseLike;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * MachineInstanceId.
             */
            public Builder machineInstanceId(String machineInstanceId) {
                this.machineInstanceId = machineInstanceId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UniqueInfo.
             */
            public Builder uniqueInfo(String uniqueInfo) {
                this.uniqueInfo = uniqueInfo;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public UniqueTagList build() {
                return new UniqueTagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRecordAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRecordAnalysisResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalysisCode")
        private String analysisCode;

        @com.aliyun.core.annotation.NameInMap("UniqueTagList")
        private java.util.List<UniqueTagList> uniqueTagList;

        private Data(Builder builder) {
            this.analysisCode = builder.analysisCode;
            this.uniqueTagList = builder.uniqueTagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysisCode
         */
        public String getAnalysisCode() {
            return this.analysisCode;
        }

        /**
         * @return uniqueTagList
         */
        public java.util.List<UniqueTagList> getUniqueTagList() {
            return this.uniqueTagList;
        }

        public static final class Builder {
            private String analysisCode; 
            private java.util.List<UniqueTagList> uniqueTagList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analysisCode = model.analysisCode;
                this.uniqueTagList = model.uniqueTagList;
            } 

            /**
             * AnalysisCode.
             */
            public Builder analysisCode(String analysisCode) {
                this.analysisCode = analysisCode;
                return this;
            }

            /**
             * UniqueTagList.
             */
            public Builder uniqueTagList(java.util.List<UniqueTagList> uniqueTagList) {
                this.uniqueTagList = uniqueTagList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
