// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CountTextResponseBody} extends {@link TeaModel}
 *
 * <p>CountTextResponseBody</p>
 */
public class CountTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("countTextCmdList")
    private java.util.List<CountTextCmdList> countTextCmdList;

    private CountTextResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.countTextCmdList = builder.countTextCmdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountTextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return countTextCmdList
     */
    public java.util.List<CountTextCmdList> getCountTextCmdList() {
        return this.countTextCmdList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<CountTextCmdList> countTextCmdList; 

        private Builder() {
        } 

        private Builder(CountTextResponseBody model) {
            this.requestId = model.requestId;
            this.countTextCmdList = model.countTextCmdList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * countTextCmdList.
         */
        public Builder countTextCmdList(java.util.List<CountTextCmdList> countTextCmdList) {
            this.countTextCmdList = countTextCmdList;
            return this;
        }

        public CountTextResponseBody build() {
            return new CountTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CountTextResponseBody} extends {@link TeaModel}
     *
     * <p>CountTextResponseBody</p>
     */
    public static class CountTextCmdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("theme")
        private String theme;

        private CountTextCmdList(Builder builder) {
            this.count = builder.count;
            this.theme = builder.theme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CountTextCmdList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return theme
         */
        public String getTheme() {
            return this.theme;
        }

        public static final class Builder {
            private Long count; 
            private String theme; 

            private Builder() {
            } 

            private Builder(CountTextCmdList model) {
                this.count = model.count;
                this.theme = model.theme;
            } 

            /**
             * count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * theme.
             */
            public Builder theme(String theme) {
                this.theme = theme;
                return this;
            }

            public CountTextCmdList build() {
                return new CountTextCmdList(this);
            } 

        } 

    }
}
