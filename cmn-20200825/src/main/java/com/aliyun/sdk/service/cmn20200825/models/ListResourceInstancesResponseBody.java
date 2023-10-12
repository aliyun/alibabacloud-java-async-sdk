// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceInstancesResponseBody</p>
 */
public class ListResourceInstancesResponseBody extends TeaModel {
    @NameInMap("LogicResource")
    private java.util.List < LogicResource> logicResource;

    @NameInMap("RequestId")
    private String requestId;

    private ListResourceInstancesResponseBody(Builder builder) {
        this.logicResource = builder.logicResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return logicResource
     */
    public java.util.List < LogicResource> getLogicResource() {
        return this.logicResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < LogicResource> logicResource; 
        private String requestId; 

        /**
         * LogicResource.
         */
        public Builder logicResource(java.util.List < LogicResource> logicResource) {
            this.logicResource = logicResource;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResourceInstancesResponseBody build() {
            return new ListResourceInstancesResponseBody(this);
        } 

    } 

    public static class KeyList extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("KeyAction")
        private String keyAction;

        @NameInMap("KeyAttribute")
        private String keyAttribute;

        @NameInMap("KeyDescription")
        private String keyDescription;

        @NameInMap("Value")
        private String value;

        private KeyList(Builder builder) {
            this.key = builder.key;
            this.keyAction = builder.keyAction;
            this.keyAttribute = builder.keyAttribute;
            this.keyDescription = builder.keyDescription;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyAction
         */
        public String getKeyAction() {
            return this.keyAction;
        }

        /**
         * @return keyAttribute
         */
        public String getKeyAttribute() {
            return this.keyAttribute;
        }

        /**
         * @return keyDescription
         */
        public String getKeyDescription() {
            return this.keyDescription;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String keyAction; 
            private String keyAttribute; 
            private String keyDescription; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * KeyAction.
             */
            public Builder keyAction(String keyAction) {
                this.keyAction = keyAction;
                return this;
            }

            /**
             * KeyAttribute.
             */
            public Builder keyAttribute(String keyAttribute) {
                this.keyAttribute = keyAttribute;
                return this;
            }

            /**
             * KeyDescription.
             */
            public Builder keyDescription(String keyDescription) {
                this.keyDescription = keyDescription;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public KeyList build() {
                return new KeyList(this);
            } 

        } 

    }
    public static class LogicResource extends TeaModel {
        @NameInMap("KeyList")
        private java.util.List < KeyList> keyList;

        @NameInMap("ResourceAttribute")
        private String resourceAttribute;

        @NameInMap("ResourceType")
        private String resourceType;

        private LogicResource(Builder builder) {
            this.keyList = builder.keyList;
            this.resourceAttribute = builder.resourceAttribute;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicResource create() {
            return builder().build();
        }

        /**
         * @return keyList
         */
        public java.util.List < KeyList> getKeyList() {
            return this.keyList;
        }

        /**
         * @return resourceAttribute
         */
        public String getResourceAttribute() {
            return this.resourceAttribute;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < KeyList> keyList; 
            private String resourceAttribute; 
            private String resourceType; 

            /**
             * KeyList.
             */
            public Builder keyList(java.util.List < KeyList> keyList) {
                this.keyList = keyList;
                return this;
            }

            /**
             * ResourceAttribute.
             */
            public Builder resourceAttribute(String resourceAttribute) {
                this.resourceAttribute = resourceAttribute;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public LogicResource build() {
                return new LogicResource(this);
            } 

        } 

    }
}
