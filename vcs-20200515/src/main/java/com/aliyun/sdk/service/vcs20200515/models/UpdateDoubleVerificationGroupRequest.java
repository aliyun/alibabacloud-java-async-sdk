// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDoubleVerificationGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateDoubleVerificationGroupRequest</p>
 */
public class UpdateDoubleVerificationGroupRequest extends Request {
    @Body
    @NameInMap("DoubleVerificationGroup")
    @Validation(required = true)
    private DoubleVerificationGroup doubleVerificationGroup;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private UpdateDoubleVerificationGroupRequest(Builder builder) {
        super(builder);
        this.doubleVerificationGroup = builder.doubleVerificationGroup;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDoubleVerificationGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return doubleVerificationGroup
     */
    public DoubleVerificationGroup getDoubleVerificationGroup() {
        return this.doubleVerificationGroup;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateDoubleVerificationGroupRequest, Builder> {
        private DoubleVerificationGroup doubleVerificationGroup; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDoubleVerificationGroupRequest response) {
            super(response);
            this.doubleVerificationGroup = response.doubleVerificationGroup;
            this.id = response.id;
        } 

        /**
         * DoubleVerificationGroup.
         */
        public Builder doubleVerificationGroup(DoubleVerificationGroup doubleVerificationGroup) {
            this.putBodyParameter("DoubleVerificationGroup", doubleVerificationGroup);
            this.doubleVerificationGroup = doubleVerificationGroup;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateDoubleVerificationGroupRequest build() {
            return new UpdateDoubleVerificationGroupRequest(this);
        } 

    } 

    public static class PersonIdList extends TeaModel {
        @NameInMap("PersonId")
        private String personId;

        @NameInMap("PersonTableId")
        private String personTableId;

        private PersonIdList(Builder builder) {
            this.personId = builder.personId;
            this.personTableId = builder.personTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonIdList create() {
            return builder().build();
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return personTableId
         */
        public String getPersonTableId() {
            return this.personTableId;
        }

        public static final class Builder {
            private String personId; 
            private String personTableId; 

            /**
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
                return this;
            }

            /**
             * PersonTableId.
             */
            public Builder personTableId(String personTableId) {
                this.personTableId = personTableId;
                return this;
            }

            public PersonIdList build() {
                return new PersonIdList(this);
            } 

        } 

    }
    public static class DoubleVerificationGroup extends TeaModel {
        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Interval")
        private Long interval;

        @NameInMap("MemberNumber")
        private Long memberNumber;

        @NameInMap("PersonIdList")
        private java.util.List < PersonIdList> personIdList;

        private DoubleVerificationGroup(Builder builder) {
            this.groupId = builder.groupId;
            this.interval = builder.interval;
            this.memberNumber = builder.memberNumber;
            this.personIdList = builder.personIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DoubleVerificationGroup create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return memberNumber
         */
        public Long getMemberNumber() {
            return this.memberNumber;
        }

        /**
         * @return personIdList
         */
        public java.util.List < PersonIdList> getPersonIdList() {
            return this.personIdList;
        }

        public static final class Builder {
            private String groupId; 
            private Long interval; 
            private Long memberNumber; 
            private java.util.List < PersonIdList> personIdList; 

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * MemberNumber.
             */
            public Builder memberNumber(Long memberNumber) {
                this.memberNumber = memberNumber;
                return this;
            }

            /**
             * PersonIdList.
             */
            public Builder personIdList(java.util.List < PersonIdList> personIdList) {
                this.personIdList = personIdList;
                return this;
            }

            public DoubleVerificationGroup build() {
                return new DoubleVerificationGroup(this);
            } 

        } 

    }
}
