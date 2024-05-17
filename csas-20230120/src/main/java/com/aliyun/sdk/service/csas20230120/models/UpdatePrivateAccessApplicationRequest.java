// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateAccessApplicationRequest</p>
 */
public class UpdatePrivateAccessApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List < String > addresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortRanges")
    private java.util.List < PortRanges> portRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List < String > tagIds;

    private UpdatePrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.addresses = builder.addresses;
        this.applicationId = builder.applicationId;
        this.description = builder.description;
        this.modifyType = builder.modifyType;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.status = builder.status;
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateAccessApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addresses
     */
    public java.util.List < String > getAddresses() {
        return this.addresses;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return portRanges
     */
    public java.util.List < PortRanges> getPortRanges() {
        return this.portRanges;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagIds
     */
    public java.util.List < String > getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<UpdatePrivateAccessApplicationRequest, Builder> {
        private java.util.List < String > addresses; 
        private String applicationId; 
        private String description; 
        private String modifyType; 
        private java.util.List < PortRanges> portRanges; 
        private String protocol; 
        private String status; 
        private java.util.List < String > tagIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrivateAccessApplicationRequest request) {
            super(request);
            this.addresses = request.addresses;
            this.applicationId = request.applicationId;
            this.description = request.description;
            this.modifyType = request.modifyType;
            this.portRanges = request.portRanges;
            this.protocol = request.protocol;
            this.status = request.status;
            this.tagIds = request.tagIds;
        } 

        /**
         * Addresses.
         */
        public Builder addresses(java.util.List < String > addresses) {
            this.putBodyParameter("Addresses", addresses);
            this.addresses = addresses;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * PortRanges.
         */
        public Builder portRanges(java.util.List < PortRanges> portRanges) {
            this.putBodyParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List < String > tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public UpdatePrivateAccessApplicationRequest build() {
            return new UpdatePrivateAccessApplicationRequest(this);
        } 

    } 

    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("End")
        @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
        private Integer end;

        private PortRanges(Builder builder) {
            this.begin = builder.begin;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRanges create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Integer getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        public static final class Builder {
            private Integer begin; 
            private Integer end; 

            /**
             * Begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            public PortRanges build() {
                return new PortRanges(this);
            } 

        } 

    }
}
