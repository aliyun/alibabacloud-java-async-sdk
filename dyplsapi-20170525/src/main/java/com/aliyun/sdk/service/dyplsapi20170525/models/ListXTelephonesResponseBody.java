// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link ListXTelephonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListXTelephonesResponseBody</p>
 */
public class ListXTelephonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListXTelephonesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListXTelephonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListXTelephonesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * <p>The details of the access denied error.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code. Valid values:</p>
         * <ul>
         * <li><p>0000: Success.</p>
         * </li>
         * <li><p>Other values: Failure.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data collection.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><p>true: Success.</p>
         * </li>
         * <li><p>false: Failure.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListXTelephonesResponseBody build() {
            return new ListXTelephonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListXTelephonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListXTelephonesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthMsg")
        private String authMsg;

        @com.aliyun.core.annotation.NameInMap("BindTime")
        private String bindTime;

        @com.aliyun.core.annotation.NameInMap("BuyTime")
        private String buyTime;

        @com.aliyun.core.annotation.NameInMap("CustomerPoolKey")
        private String customerPoolKey;

        @com.aliyun.core.annotation.NameInMap("CustomerPoolName")
        private String customerPoolName;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("SmsStatus")
        private String smsStatus;

        @com.aliyun.core.annotation.NameInMap("Telephone")
        private String telephone;

        @com.aliyun.core.annotation.NameInMap("TelephoneStatus")
        private String telephoneStatus;

        @com.aliyun.core.annotation.NameInMap("UnbindTime")
        private String unbindTime;

        private List(Builder builder) {
            this.authMsg = builder.authMsg;
            this.bindTime = builder.bindTime;
            this.buyTime = builder.buyTime;
            this.customerPoolKey = builder.customerPoolKey;
            this.customerPoolName = builder.customerPoolName;
            this.releaseTime = builder.releaseTime;
            this.smsStatus = builder.smsStatus;
            this.telephone = builder.telephone;
            this.telephoneStatus = builder.telephoneStatus;
            this.unbindTime = builder.unbindTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return authMsg
         */
        public String getAuthMsg() {
            return this.authMsg;
        }

        /**
         * @return bindTime
         */
        public String getBindTime() {
            return this.bindTime;
        }

        /**
         * @return buyTime
         */
        public String getBuyTime() {
            return this.buyTime;
        }

        /**
         * @return customerPoolKey
         */
        public String getCustomerPoolKey() {
            return this.customerPoolKey;
        }

        /**
         * @return customerPoolName
         */
        public String getCustomerPoolName() {
            return this.customerPoolName;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return smsStatus
         */
        public String getSmsStatus() {
            return this.smsStatus;
        }

        /**
         * @return telephone
         */
        public String getTelephone() {
            return this.telephone;
        }

        /**
         * @return telephoneStatus
         */
        public String getTelephoneStatus() {
            return this.telephoneStatus;
        }

        /**
         * @return unbindTime
         */
        public String getUnbindTime() {
            return this.unbindTime;
        }

        public static final class Builder {
            private String authMsg; 
            private String bindTime; 
            private String buyTime; 
            private String customerPoolKey; 
            private String customerPoolName; 
            private String releaseTime; 
            private String smsStatus; 
            private String telephone; 
            private String telephoneStatus; 
            private String unbindTime; 

            private Builder() {
            } 

            private Builder(List model) {
                this.authMsg = model.authMsg;
                this.bindTime = model.bindTime;
                this.buyTime = model.buyTime;
                this.customerPoolKey = model.customerPoolKey;
                this.customerPoolName = model.customerPoolName;
                this.releaseTime = model.releaseTime;
                this.smsStatus = model.smsStatus;
                this.telephone = model.telephone;
                this.telephoneStatus = model.telephoneStatus;
                this.unbindTime = model.unbindTime;
            } 

            /**
             * <p>The reason for binding failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Binding failed: user ID card blacklisted</p>
             */
            public Builder authMsg(String authMsg) {
                this.authMsg = authMsg;
                return this;
            }

            /**
             * <p>The binding time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-29 17:23:58</p>
             */
            public Builder bindTime(String bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * <p>The purchase time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-29 17:23:58</p>
             */
            public Builder buyTime(String buyTime) {
                this.buyTime = buyTime;
                return this;
            }

            /**
             * <p>The customer number pool key.</p>
             * 
             * <strong>example:</strong>
             * <p>FC533e6eeb81f4400c87ef3745a21a1a</p>
             */
            public Builder customerPoolKey(String customerPoolKey) {
                this.customerPoolKey = customerPoolKey;
                return this;
            }

            /**
             * <p>The number pool name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test number pool</p>
             */
            public Builder customerPoolName(String customerPoolName) {
                this.customerPoolName = customerPoolName;
                return this;
            }

            /**
             * <p>The release time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-29 17:23:58</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The SMS activation status. Valid values:</p>
             * <ul>
             * <li>0: Not activated.</li>
             * <li>1: Activated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder smsStatus(String smsStatus) {
                this.smsStatus = smsStatus;
                return this;
            }

            /**
             * <p>The X number.</p>
             * 
             * <strong>example:</strong>
             * <p>17816876546</p>
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * <p>The number status. Valid values:</p>
             * <ul>
             * <li>0: Idle.</li>
             * <li>1: Allocation completed and pending purchase.</li>
             * <li>2: Purchase completed and pending verification.</li>
             * <li>3: Real-name verification in progress.</li>
             * <li>4: Real-name verification succeeded.</li>
             * <li>5: Verification failed.</li>
             * <li>6: Unbinding in progress.</li>
             * <li>7: Unbinding failed.</li>
             * <li>8: Released.</li>
             * <li>99: Released due to timeout.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder telephoneStatus(String telephoneStatus) {
                this.telephoneStatus = telephoneStatus;
                return this;
            }

            /**
             * <p>The unbinding time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-29 17:23:58</p>
             */
            public Builder unbindTime(String unbindTime) {
                this.unbindTime = unbindTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListXTelephonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListXTelephonesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The data list.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries that meet the query conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
