// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link GetSavingPlanShareAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSavingPlanShareAccountsResponseBody</p>
 */
public class GetSavingPlanShareAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSavingPlanShareAccountsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSavingPlanShareAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSavingPlanShareAccountsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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

        public GetSavingPlanShareAccountsResponseBody build() {
            return new GetSavingPlanShareAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSavingPlanShareAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanShareAccountsResponseBody</p>
     */
    public static class ShareTimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShareEndTime")
        private String shareEndTime;

        @com.aliyun.core.annotation.NameInMap("ShareStartTime")
        private String shareStartTime;

        private ShareTimeList(Builder builder) {
            this.shareEndTime = builder.shareEndTime;
            this.shareStartTime = builder.shareStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShareTimeList create() {
            return builder().build();
        }

        /**
         * @return shareEndTime
         */
        public String getShareEndTime() {
            return this.shareEndTime;
        }

        /**
         * @return shareStartTime
         */
        public String getShareStartTime() {
            return this.shareStartTime;
        }

        public static final class Builder {
            private String shareEndTime; 
            private String shareStartTime; 

            private Builder() {
            } 

            private Builder(ShareTimeList model) {
                this.shareEndTime = model.shareEndTime;
                this.shareStartTime = model.shareStartTime;
            } 

            /**
             * ShareEndTime.
             */
            public Builder shareEndTime(String shareEndTime) {
                this.shareEndTime = shareEndTime;
                return this;
            }

            /**
             * ShareStartTime.
             */
            public Builder shareStartTime(String shareStartTime) {
                this.shareStartTime = shareStartTime;
                return this;
            }

            public ShareTimeList build() {
                return new ShareTimeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanShareAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanShareAccountsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ShareTimeList")
        private java.util.List<ShareTimeList> shareTimeList;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.aliUid = builder.aliUid;
            this.shareTimeList = builder.shareTimeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return shareTimeList
         */
        public java.util.List<ShareTimeList> getShareTimeList() {
            return this.shareTimeList;
        }

        public static final class Builder {
            private String accountId; 
            private Long aliUid; 
            private java.util.List<ShareTimeList> shareTimeList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.aliUid = model.aliUid;
                this.shareTimeList = model.shareTimeList;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * ShareTimeList.
             */
            public Builder shareTimeList(java.util.List<ShareTimeList> shareTimeList) {
                this.shareTimeList = shareTimeList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
