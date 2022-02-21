// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowsResponseBody</p>
 */
public class ListFlowsResponseBody extends TeaModel {
    @NameInMap("Flows")
    private java.util.List < Flows> flows;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListFlowsResponseBody(Builder builder) {
        this.flows = builder.flows;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowsResponseBody create() {
        return builder().build();
    }

    /**
     * @return flows
     */
    public java.util.List < Flows> getFlows() {
        return this.flows;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Flows> flows; 
        private String nextToken; 
        private String requestId; 

        /**
         * Flows.
         */
        public Builder flows(java.util.List < Flows> flows) {
            this.flows = flows;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFlowsResponseBody build() {
            return new ListFlowsResponseBody(this);
        } 

    } 

    public static class Flows extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Definition")
        private String definition;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExternalStorageLocation")
        private String externalStorageLocation;

        @NameInMap("Id")
        private String id;

        @NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("Type")
        private String type;

        private Flows(Builder builder) {
            this.createdTime = builder.createdTime;
            this.definition = builder.definition;
            this.description = builder.description;
            this.externalStorageLocation = builder.externalStorageLocation;
            this.id = builder.id;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.name = builder.name;
            this.roleArn = builder.roleArn;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flows create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return externalStorageLocation
         */
        public String getExternalStorageLocation() {
            return this.externalStorageLocation;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createdTime; 
            private String definition; 
            private String description; 
            private String externalStorageLocation; 
            private String id; 
            private String lastModifiedTime; 
            private String name; 
            private String roleArn; 
            private String type; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExternalStorageLocation.
             */
            public Builder externalStorageLocation(String externalStorageLocation) {
                this.externalStorageLocation = externalStorageLocation;
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
             * LastModifiedTime.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
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
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Flows build() {
                return new Flows(this);
            } 

        } 

    }
}
