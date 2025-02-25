// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddTerminalsRequest} extends {@link RequestModel}
 *
 * <p>AddTerminalsRequest</p>
 */
public class AddTerminalsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddTerminalParams")
    private java.util.List < AddTerminalParams> addTerminalParams;

    private AddTerminalsRequest(Builder builder) {
        super(builder);
        this.addTerminalParams = builder.addTerminalParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTerminalsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addTerminalParams
     */
    public java.util.List < AddTerminalParams> getAddTerminalParams() {
        return this.addTerminalParams;
    }

    public static final class Builder extends Request.Builder<AddTerminalsRequest, Builder> {
        private java.util.List < AddTerminalParams> addTerminalParams; 

        private Builder() {
            super();
        } 

        private Builder(AddTerminalsRequest request) {
            super(request);
            this.addTerminalParams = request.addTerminalParams;
        } 

        /**
         * AddTerminalParams.
         */
        public Builder addTerminalParams(java.util.List < AddTerminalParams> addTerminalParams) {
            this.putBodyParameter("AddTerminalParams", addTerminalParams);
            this.addTerminalParams = addTerminalParams;
            return this;
        }

        @Override
        public AddTerminalsRequest build() {
            return new AddTerminalsRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddTerminalsRequest} extends {@link TeaModel}
     *
     * <p>AddTerminalsRequest</p>
     */
    public static class AddTerminalParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private Integer clientType;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
        private String terminalGroupId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private AddTerminalParams(Builder builder) {
            this.alias = builder.alias;
            this.clientType = builder.clientType;
            this.serialNumber = builder.serialNumber;
            this.terminalGroupId = builder.terminalGroupId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddTerminalParams create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return clientType
         */
        public Integer getClientType() {
            return this.clientType;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return terminalGroupId
         */
        public String getTerminalGroupId() {
            return this.terminalGroupId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String alias; 
            private Integer clientType; 
            private String serialNumber; 
            private String terminalGroupId; 
            private String uuid; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(Integer clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * TerminalGroupId.
             */
            public Builder terminalGroupId(String terminalGroupId) {
                this.terminalGroupId = terminalGroupId;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AddTerminalParams build() {
                return new AddTerminalParams(this);
            } 

        } 

    }
}
