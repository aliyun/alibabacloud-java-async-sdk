// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIdpConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdpConfigsResponseBody</p>
 */
public class ListIdpConfigsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListIdpConfigsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdpConfigsResponseBody create() {
        return builder().build();
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
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIdpConfigsResponseBody build() {
            return new ListIdpConfigsResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("Mfa")
        private String mfa;

        @NameInMap("MobileLoginType")
        private String mobileLoginType;

        @NameInMap("MobileMfaConfigType")
        private String mobileMfaConfigType;

        @NameInMap("MultiIdpInfo")
        private String multiIdpInfo;

        @NameInMap("Name")
        private String name;

        @NameInMap("PcLoginType")
        private String pcLoginType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private String updateTime;

        private DataList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.mfa = builder.mfa;
            this.mobileLoginType = builder.mobileLoginType;
            this.mobileMfaConfigType = builder.mobileMfaConfigType;
            this.multiIdpInfo = builder.multiIdpInfo;
            this.name = builder.name;
            this.pcLoginType = builder.pcLoginType;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mfa
         */
        public String getMfa() {
            return this.mfa;
        }

        /**
         * @return mobileLoginType
         */
        public String getMobileLoginType() {
            return this.mobileLoginType;
        }

        /**
         * @return mobileMfaConfigType
         */
        public String getMobileMfaConfigType() {
            return this.mobileMfaConfigType;
        }

        /**
         * @return multiIdpInfo
         */
        public String getMultiIdpInfo() {
            return this.multiIdpInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pcLoginType
         */
        public String getPcLoginType() {
            return this.pcLoginType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String mfa; 
            private String mobileLoginType; 
            private String mobileMfaConfigType; 
            private String multiIdpInfo; 
            private String name; 
            private String pcLoginType; 
            private String status; 
            private String type; 
            private String updateTime; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Mfa.
             */
            public Builder mfa(String mfa) {
                this.mfa = mfa;
                return this;
            }

            /**
             * MobileLoginType.
             */
            public Builder mobileLoginType(String mobileLoginType) {
                this.mobileLoginType = mobileLoginType;
                return this;
            }

            /**
             * MobileMfaConfigType.
             */
            public Builder mobileMfaConfigType(String mobileMfaConfigType) {
                this.mobileMfaConfigType = mobileMfaConfigType;
                return this;
            }

            /**
             * MultiIdpInfo.
             */
            public Builder multiIdpInfo(String multiIdpInfo) {
                this.multiIdpInfo = multiIdpInfo;
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
             * PcLoginType.
             */
            public Builder pcLoginType(String pcLoginType) {
                this.pcLoginType = pcLoginType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataList")
        private java.util.List < DataList> dataList;

        @NameInMap("TotalNum")
        private Long totalNum;

        private Data(Builder builder) {
            this.dataList = builder.dataList;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataList
         */
        public java.util.List < DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private java.util.List < DataList> dataList; 
            private Long totalNum; 

            /**
             * DataList.
             */
            public Builder dataList(java.util.List < DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
