// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdMemberListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdMemberListResponseBody</p>
 */
public class DescribeRdMemberListResponseBody extends TeaModel {
    @NameInMap("MemberList")
    private java.util.List < MemberList> memberList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * MemberList.
         */
        public Builder memberList(java.util.List < MemberList> memberList) {
            this.memberList = memberList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeRdMemberListResponseBody build() {
            return new DescribeRdMemberListResponseBody(this);
        } 

    } 

    public static class MemberList extends TeaModel {
        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Name")
        private String name;

        @NameInMap("Uid")
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
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * Uid.
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
