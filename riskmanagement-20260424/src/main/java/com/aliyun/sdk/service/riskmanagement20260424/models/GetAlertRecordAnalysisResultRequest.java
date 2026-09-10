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
         * <p>The unique identifier of the alert event. (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>9b57f0fcf98181df8d8487d1cc91cb8d</p>
         */
        public Builder alarmUniqueInfo(String alarmUniqueInfo) {
            this.putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }

        /**
         * <p>The language of the content. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The unique ID of the alert event. (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>fc312aa0c32ba8a6147db6221fb1c1ee</p>
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        /**
         * <p>The array of tracing requests.</p>
         */
        public Builder uniqueTagList(java.util.List<UniqueTagList> uniqueTagList) {
            String uniqueTagListShrink = shrink(uniqueTagList, "UniqueTagList", "json");
            this.putQueryParameter("UniqueTagList", uniqueTagListShrink);
            this.uniqueTagList = uniqueTagList;
            return this;
        }

        /**
         * <p>The unique identifier of the asset. (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>ebde6d4e3e4aba728962eec43a69196e9J7tt7H47Pc</p>
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
             * <p>The unique ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>10a19b654e73ff079ede61ce3f4465e0</p>
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * <p>Indicates whether the result is liked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Liked.</li>
             * <li><strong>false</strong>: Not liked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder chooseLike(Boolean chooseLike) {
                this.chooseLike = chooseLike;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp19up785757dz800</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-rj9c7d4bli38***tuym</p>
             */
            public Builder machineInstanceId(String machineInstanceId) {
                this.machineInstanceId = machineInstanceId;
                return this;
            }

            /**
             * <p>The query tracing time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-27 00:00:00</p>
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The vulnerability type.</p>
             * 
             * <strong>example:</strong>
             * <p>BusinessLicense</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The unique identifier of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>fc312aa0c32ba8a6147db6221fb1c1ee</p>
             */
            public Builder uniqueInfo(String uniqueInfo) {
                this.uniqueInfo = uniqueInfo;
                return this;
            }

            /**
             * <p>The unique identifier of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>3309e55fcb1ed8d4bc6af098e62e0353RNabnQSO1bx</p>
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
