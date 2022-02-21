// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotPersonTableRequest} extends {@link RequestModel}
 *
 * <p>AddAiotPersonTableRequest</p>
 */
public class AddAiotPersonTableRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("PersonTable")
    @Validation(required = true)
    private PersonTable personTable;

    private AddAiotPersonTableRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.personTable = builder.personTable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAiotPersonTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return personTable
     */
    public PersonTable getPersonTable() {
        return this.personTable;
    }

    public static final class Builder extends Request.Builder<AddAiotPersonTableRequest, Builder> {
        private String id; 
        private PersonTable personTable; 

        private Builder() {
            super();
        } 

        private Builder(AddAiotPersonTableRequest response) {
            super(response);
            this.id = response.id;
            this.personTable = response.personTable;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * PersonTable.
         */
        public Builder personTable(PersonTable personTable) {
            this.putBodyParameter("PersonTable", personTable);
            this.personTable = personTable;
            return this;
        }

        @Override
        public AddAiotPersonTableRequest build() {
            return new AddAiotPersonTableRequest(this);
        } 

    } 

    public static class PersonTable extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("PersonTableId")
        @Validation(required = true)
        private String personTableId;

        @NameInMap("Type")
        @Validation(required = true)
        private Long type;

        @NameInMap("VerificationModelList")
        @Validation(required = true)
        private java.util.List < Long > verificationModelList;

        private PersonTable(Builder builder) {
            this.name = builder.name;
            this.personTableId = builder.personTableId;
            this.type = builder.type;
            this.verificationModelList = builder.verificationModelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonTable create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return personTableId
         */
        public String getPersonTableId() {
            return this.personTableId;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return verificationModelList
         */
        public java.util.List < Long > getVerificationModelList() {
            return this.verificationModelList;
        }

        public static final class Builder {
            private String name; 
            private String personTableId; 
            private Long type; 
            private java.util.List < Long > verificationModelList; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PersonTableId.
             */
            public Builder personTableId(String personTableId) {
                this.personTableId = personTableId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * VerificationModelList.
             */
            public Builder verificationModelList(java.util.List < Long > verificationModelList) {
                this.verificationModelList = verificationModelList;
                return this;
            }

            public PersonTable build() {
                return new PersonTable(this);
            } 

        } 

    }
}
