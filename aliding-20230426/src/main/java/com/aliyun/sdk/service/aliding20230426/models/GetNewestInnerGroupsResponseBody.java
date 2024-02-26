// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNewestInnerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>GetNewestInnerGroupsResponseBody</p>
 */
public class GetNewestInnerGroupsResponseBody extends TeaModel {
    @NameInMap("groupInfos")
    private java.util.List < GroupInfos> groupInfos;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private GetNewestInnerGroupsResponseBody(Builder builder) {
        this.groupInfos = builder.groupInfos;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNewestInnerGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupInfos
     */
    public java.util.List < GroupInfos> getGroupInfos() {
        return this.groupInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List < GroupInfos> groupInfos; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * groupInfos.
         */
        public Builder groupInfos(java.util.List < GroupInfos> groupInfos) {
            this.groupInfos = groupInfos;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetNewestInnerGroupsResponseBody build() {
            return new GetNewestInnerGroupsResponseBody(this);
        } 

    } 

    public static class GroupInfos extends TeaModel {
        @NameInMap("Icon")
        private String icon;

        @NameInMap("MemberAmount")
        private String memberAmount;

        @NameInMap("OpenConversationId")
        private String openConversationId;

        @NameInMap("Title")
        private String title;

        private GroupInfos(Builder builder) {
            this.icon = builder.icon;
            this.memberAmount = builder.memberAmount;
            this.openConversationId = builder.openConversationId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfos create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return memberAmount
         */
        public String getMemberAmount() {
            return this.memberAmount;
        }

        /**
         * @return openConversationId
         */
        public String getOpenConversationId() {
            return this.openConversationId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String icon; 
            private String memberAmount; 
            private String openConversationId; 
            private String title; 

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * MemberAmount.
             */
            public Builder memberAmount(String memberAmount) {
                this.memberAmount = memberAmount;
                return this;
            }

            /**
             * OpenConversationId.
             */
            public Builder openConversationId(String openConversationId) {
                this.openConversationId = openConversationId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public GroupInfos build() {
                return new GroupInfos(this);
            } 

        } 

    }
}
