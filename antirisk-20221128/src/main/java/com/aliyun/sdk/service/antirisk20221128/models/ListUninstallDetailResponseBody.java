// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUninstallDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListUninstallDetailResponseBody</p>
 */
public class ListUninstallDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListUninstallDetailResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.success = builder.success;
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUninstallDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String msg; 
        private Boolean success; 
        private Long code; 
        private Data data; 
        private String requestId; 

        /**
         * msg
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * code
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUninstallDetailResponseBody build() {
            return new ListUninstallDetailResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeDatetime")
        private String activeDatetime;

        @com.aliyun.core.annotation.NameInMap("city")
        private String city;

        @com.aliyun.core.annotation.NameInMap("deviceBrand")
        private String deviceBrand;

        @com.aliyun.core.annotation.NameInMap("deviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("firstActiveDatetime")
        private String firstActiveDatetime;

        @com.aliyun.core.annotation.NameInMap("idfa")
        private String idfa;

        @com.aliyun.core.annotation.NameInMap("imei")
        private String imei;

        @com.aliyun.core.annotation.NameInMap("installAppVersion")
        private String installAppVersion;

        @com.aliyun.core.annotation.NameInMap("installChannel")
        private String installChannel;

        @com.aliyun.core.annotation.NameInMap("oaid")
        private String oaid;

        @com.aliyun.core.annotation.NameInMap("osVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("puid")
        private String puid;

        @com.aliyun.core.annotation.NameInMap("umid")
        private String umid;

        @com.aliyun.core.annotation.NameInMap("uninstallCount")
        private Integer uninstallCount;

        @com.aliyun.core.annotation.NameInMap("uninstallDatetime")
        private String uninstallDatetime;

        @com.aliyun.core.annotation.NameInMap("zid")
        private String zid;

        private Details(Builder builder) {
            this.activeDatetime = builder.activeDatetime;
            this.city = builder.city;
            this.deviceBrand = builder.deviceBrand;
            this.deviceModel = builder.deviceModel;
            this.firstActiveDatetime = builder.firstActiveDatetime;
            this.idfa = builder.idfa;
            this.imei = builder.imei;
            this.installAppVersion = builder.installAppVersion;
            this.installChannel = builder.installChannel;
            this.oaid = builder.oaid;
            this.osVersion = builder.osVersion;
            this.puid = builder.puid;
            this.umid = builder.umid;
            this.uninstallCount = builder.uninstallCount;
            this.uninstallDatetime = builder.uninstallDatetime;
            this.zid = builder.zid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return activeDatetime
         */
        public String getActiveDatetime() {
            return this.activeDatetime;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return deviceBrand
         */
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return firstActiveDatetime
         */
        public String getFirstActiveDatetime() {
            return this.firstActiveDatetime;
        }

        /**
         * @return idfa
         */
        public String getIdfa() {
            return this.idfa;
        }

        /**
         * @return imei
         */
        public String getImei() {
            return this.imei;
        }

        /**
         * @return installAppVersion
         */
        public String getInstallAppVersion() {
            return this.installAppVersion;
        }

        /**
         * @return installChannel
         */
        public String getInstallChannel() {
            return this.installChannel;
        }

        /**
         * @return oaid
         */
        public String getOaid() {
            return this.oaid;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return puid
         */
        public String getPuid() {
            return this.puid;
        }

        /**
         * @return umid
         */
        public String getUmid() {
            return this.umid;
        }

        /**
         * @return uninstallCount
         */
        public Integer getUninstallCount() {
            return this.uninstallCount;
        }

        /**
         * @return uninstallDatetime
         */
        public String getUninstallDatetime() {
            return this.uninstallDatetime;
        }

        /**
         * @return zid
         */
        public String getZid() {
            return this.zid;
        }

        public static final class Builder {
            private String activeDatetime; 
            private String city; 
            private String deviceBrand; 
            private String deviceModel; 
            private String firstActiveDatetime; 
            private String idfa; 
            private String imei; 
            private String installAppVersion; 
            private String installChannel; 
            private String oaid; 
            private String osVersion; 
            private String puid; 
            private String umid; 
            private Integer uninstallCount; 
            private String uninstallDatetime; 
            private String zid; 

            /**
             * activeDatetime.
             */
            public Builder activeDatetime(String activeDatetime) {
                this.activeDatetime = activeDatetime;
                return this;
            }

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * deviceBrand
             */
            public Builder deviceBrand(String deviceBrand) {
                this.deviceBrand = deviceBrand;
                return this;
            }

            /**
             * deviceModel
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * firstActiveDatetime
             */
            public Builder firstActiveDatetime(String firstActiveDatetime) {
                this.firstActiveDatetime = firstActiveDatetime;
                return this;
            }

            /**
             * idfa
             */
            public Builder idfa(String idfa) {
                this.idfa = idfa;
                return this;
            }

            /**
             * imei
             */
            public Builder imei(String imei) {
                this.imei = imei;
                return this;
            }

            /**
             * installAppVersion
             */
            public Builder installAppVersion(String installAppVersion) {
                this.installAppVersion = installAppVersion;
                return this;
            }

            /**
             * installChannel
             */
            public Builder installChannel(String installChannel) {
                this.installChannel = installChannel;
                return this;
            }

            /**
             * oaid
             */
            public Builder oaid(String oaid) {
                this.oaid = oaid;
                return this;
            }

            /**
             * osVersion
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * puid
             */
            public Builder puid(String puid) {
                this.puid = puid;
                return this;
            }

            /**
             * umid.
             */
            public Builder umid(String umid) {
                this.umid = umid;
                return this;
            }

            /**
             * uninstallCount.
             */
            public Builder uninstallCount(Integer uninstallCount) {
                this.uninstallCount = uninstallCount;
                return this;
            }

            /**
             * uninstallDatetime.
             */
            public Builder uninstallDatetime(String uninstallDatetime) {
                this.uninstallDatetime = uninstallDatetime;
                return this;
            }

            /**
             * zid
             */
            public Builder zid(String zid) {
                this.zid = zid;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("details")
        private java.util.List < Details> details;

        private Data(Builder builder) {
            this.details = builder.details;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        public static final class Builder {
            private java.util.List < Details> details; 

            /**
             * details.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
