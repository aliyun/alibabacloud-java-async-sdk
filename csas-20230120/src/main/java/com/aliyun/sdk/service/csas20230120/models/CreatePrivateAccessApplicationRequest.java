// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivateAccessApplicationRequest</p>
 */
public class CreatePrivateAccessApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Addresses")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > addresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortRanges")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < PortRanges> portRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List < String > tagIds;

    private CreatePrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.addresses = builder.addresses;
        this.description = builder.description;
        this.name = builder.name;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.status = builder.status;
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateAccessApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePrivateAccessApplicationRequest, Builder> {
        private java.util.List < String > addresses; 
        private String description; 
        private String name; 
        private java.util.List < PortRanges> portRanges; 
        private String protocol; 
        private String status; 
        private java.util.List < String > tagIds; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrivateAccessApplicationRequest request) {
            super(request);
            this.addresses = request.addresses;
            this.description = request.description;
            this.name = request.name;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
        public CreatePrivateAccessApplicationRequest build() {
            return new CreatePrivateAccessApplicationRequest(this);
        } 

    } 

    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("End")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
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
