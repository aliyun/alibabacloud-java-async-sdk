// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnloadRegionSDGRequest} extends {@link RequestModel}
 *
 * <p>UnloadRegionSDGRequest</p>
 */
public class UnloadRegionSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > destinationRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespaces")
    private java.util.List < String > namespaces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SDGId;

    private UnloadRegionSDGRequest(Builder builder) {
        super(builder);
        this.destinationRegionIds = builder.destinationRegionIds;
        this.namespaces = builder.namespaces;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnloadRegionSDGRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationRegionIds
     */
    public java.util.List < String > getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    /**
     * @return namespaces
     */
    public java.util.List < String > getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<UnloadRegionSDGRequest, Builder> {
        private java.util.List < String > destinationRegionIds; 
        private java.util.List < String > namespaces; 
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(UnloadRegionSDGRequest request) {
            super(request);
            this.destinationRegionIds = request.destinationRegionIds;
            this.namespaces = request.namespaces;
            this.SDGId = request.SDGId;
        } 

        /**
         * DestinationRegionIds.
         */
        public Builder destinationRegionIds(java.util.List < String > destinationRegionIds) {
            String destinationRegionIdsShrink = shrink(destinationRegionIds, "DestinationRegionIds", "json");
            this.putQueryParameter("DestinationRegionIds", destinationRegionIdsShrink);
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }

        /**
         * Namespaces.
         */
        public Builder namespaces(java.util.List < String > namespaces) {
            String namespacesShrink = shrink(namespaces, "Namespaces", "json");
            this.putQueryParameter("Namespaces", namespacesShrink);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * SDGId.
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public UnloadRegionSDGRequest build() {
            return new UnloadRegionSDGRequest(this);
        } 

    } 

}
