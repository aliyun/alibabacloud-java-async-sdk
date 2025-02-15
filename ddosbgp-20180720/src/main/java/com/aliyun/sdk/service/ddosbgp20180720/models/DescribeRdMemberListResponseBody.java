// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRdMemberListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdMemberListResponseBody</p>
 */
public class DescribeRdMemberListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MemberList")
    private java.util.List < MemberList> memberList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeRdMemberListResponseBody(Builder builder) {
        this.memberList = builder.memberList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdMemberListResponseBody create() {
        return builder().build();
    }

    /**
     * @return memberList
     */
    public java.util.List < MemberList> getMemberList() {
        return this.memberList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < MemberList> memberList; 
        private String requestId; 
        private Long total; 

        /**
         * <p>The list of the members.</p>
         */
        public Builder memberList(java.util.List < MemberList> memberList) {
            this.memberList = memberList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DC245DEE-9800-5579-BF99-189D6A5BA9FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeRdMemberListResponseBody build() {
            return new DescribeRdMemberListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRdMemberListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdMemberListResponseBody</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private MemberList(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.name = builder.name;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private String name; 
            private String uid; 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1624954942000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>1960279802016267</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
}
