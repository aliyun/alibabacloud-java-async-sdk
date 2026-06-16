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
 * {@link GetAlertRecordAnalysisResultRequest} extends {@link RequestModel}
 *
 * <p>GetAlertRecordAnalysisResultRequest</p>
 */
public class GetAlertRecordAnalysisResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
    private String alarmUniqueInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueInfo")
    private String uniqueInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueTagList")
    private java.util.List<UniqueTagList> uniqueTagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetAlertRecordAnalysisResultRequest(Builder builder) {
        super(builder);
        this.alarmUniqueInfo = builder.alarmUniqueInfo;
        this.aliyunLang = builder.aliyunLang;
        this.uniqueInfo = builder.uniqueInfo;
        this.uniqueTagList = builder.uniqueTagList;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertRecordAnalysisResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmUniqueInfo
     */
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return uniqueInfo
     */
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    /**
     * @return uniqueTagList
     */
    public java.util.List<UniqueTagList> getUniqueTagList() {
        return this.uniqueTagList;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetAlertRecordAnalysisResultRequest, Builder> {
        private String alarmUniqueInfo; 
        private String aliyunLang; 
        private String uniqueInfo; 
        private java.util.List<UniqueTagList> uniqueTagList; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertRecordAnalysisResultRequest request) {
            super(request);
            this.alarmUniqueInfo = request.alarmUniqueInfo;
            this.aliyunLang = request.aliyunLang;
            this.uniqueInfo = request.uniqueInfo;
            this.uniqueTagList = request.uniqueTagList;
            this.uuid = request.uuid;
        } 

        /**
         * AlarmUniqueInfo.
         */
        public Builder alarmUniqueInfo(String alarmUniqueInfo) {
            this.putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }

        /**
         * AliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * UniqueInfo.
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        /**
         * UniqueTagList.
         */
        public Builder uniqueTagList(java.util.List<UniqueTagList> uniqueTagList) {
            String uniqueTagListShrink = shrink(uniqueTagList, "UniqueTagList", "json");
            this.putQueryParameter("UniqueTagList", uniqueTagListShrink);
            this.uniqueTagList = uniqueTagList;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetAlertRecordAnalysisResultRequest build() {
            return new GetAlertRecordAnalysisResultRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAlertRecordAnalysisResultRequest} extends {@link TeaModel}
     *
     * <p>GetAlertRecordAnalysisResultRequest</p>
     */
    public static class UniqueTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @com.aliyun.core.annotation.NameInMap("ChooseLike")
        private Boolean chooseLike;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("MachineInstanceId")
        private String machineInstanceId;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private String queryTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UniqueInfo")
        private String uniqueInfo;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private UniqueTagList(Builder builder) {
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.chooseLike = builder.chooseLike;
            this.ip = builder.ip;
            this.machineInstanceId = builder.machineInstanceId;
            this.queryTime = builder.queryTime;
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
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
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
            private Boolean chooseLike; 
            private String ip; 
            private String machineInstanceId; 
            private String queryTime; 
            private String type; 
            private String uniqueInfo; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(UniqueTagList model) {
                this.alarmUniqueInfo = model.alarmUniqueInfo;
                this.chooseLike = model.chooseLike;
                this.ip = model.ip;
                this.machineInstanceId = model.machineInstanceId;
                this.queryTime = model.queryTime;
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
             * QueryTime.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
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
}
