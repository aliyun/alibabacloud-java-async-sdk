// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespacesResponseBody</p>
 */
public class ListNamespacesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListNamespacesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListNamespacesResponseBody build() {
            return new ListNamespacesResponseBody(this);
        } 

    } 

    public static class Namespaces extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("UId")
        private String UId;

        private Namespaces(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.UId = builder.UId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return UId
         */
        public String getUId() {
            return this.UId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String UId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * UId.
             */
            public Builder UId(String UId) {
                this.UId = UId;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Namespaces")
        private java.util.List < Namespaces> namespaces;

        private Data(Builder builder) {
            this.namespaces = builder.namespaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return namespaces
         */
        public java.util.List < Namespaces> getNamespaces() {
            return this.namespaces;
        }

        public static final class Builder {
            private java.util.List < Namespaces> namespaces; 

            /**
             * Namespaces.
             */
            public Builder namespaces(java.util.List < Namespaces> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
