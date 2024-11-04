// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListXTelephonesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListXTelephonesResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Long pageNo; 
        private Long pageSize; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>返回状态码 0000表示成功 其他表示失败</p>
         * 
         * <strong>example:</strong>
         * <p>0000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>数据集合</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>返回信息</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>页码</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>每页条数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>返回是否成功 true  表示成功 false表示失败</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>符合查询条件的总数量</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
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
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            /**
             * <p>绑定失败原因</p>
             * 
             * <strong>example:</strong>
             * <p>绑定失败用户身份证黑名单</p>
             */
            public Builder authMsg(String authMsg) {
                this.authMsg = authMsg;
                return this;
            }

            /**
             * <p>绑定时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-29 17:23:58</p>
             */
            public Builder bindTime(String bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * <p>购买时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-29 17:23:58</p>
             */
            public Builder buyTime(String buyTime) {
                this.buyTime = buyTime;
                return this;
            }

            /**
             * <p>客户号码池key</p>
             * 
             * <strong>example:</strong>
             * <p>FC5***********************a1a</p>
             */
            public Builder customerPoolKey(String customerPoolKey) {
                this.customerPoolKey = customerPoolKey;
                return this;
            }

            /**
             * <p>号码池名称</p>
             * 
             * <strong>example:</strong>
             * <p>测试号码池</p>
             */
            public Builder customerPoolName(String customerPoolName) {
                this.customerPoolName = customerPoolName;
                return this;
            }

            /**
             * <p>释放时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-29 17:23:58</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>短信开通状态：0 未开通 1已开通</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder smsStatus(String smsStatus) {
                this.smsStatus = smsStatus;
                return this;
            }

            /**
             * <p>X号码</p>
             * 
             * <strong>example:</strong>
             * <p>17*******46</p>
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * <p>号码状态：0 空闲中 1 调拨完成待购买 2购买完成待认证  3 实名认证中  4 实名认证成功  5 认证失败  6 解绑中 7 解绑失败 8已释放 99 超时释放</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder telephoneStatus(String telephoneStatus) {
                this.telephoneStatus = telephoneStatus;
                return this;
            }

            /**
             * <p>解绑时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-29 17:23:58</p>
             */
            public Builder unbindTime(String unbindTime) {
                this.unbindTime = unbindTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
