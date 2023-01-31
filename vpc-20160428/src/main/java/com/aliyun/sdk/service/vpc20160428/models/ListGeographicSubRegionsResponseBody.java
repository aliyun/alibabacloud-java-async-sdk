// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeographicSubRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGeographicSubRegionsResponseBody</p>
 */
public class ListGeographicSubRegionsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Long count;

    @NameInMap("GeographicSubRegions")
    private java.util.List < String > geographicSubRegions;

    @NameInMap("RequestId")
    private String requestId;

    private ListGeographicSubRegionsResponseBody(Builder builder) {
        this.count = builder.count;
        this.geographicSubRegions = builder.geographicSubRegions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGeographicSubRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return geographicSubRegions
     */
    public java.util.List < String > getGeographicSubRegions() {
        return this.geographicSubRegions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List < String > geographicSubRegions; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * GeographicSubRegions.
         */
        public Builder geographicSubRegions(java.util.List < String > geographicSubRegions) {
            this.geographicSubRegions = geographicSubRegions;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGeographicSubRegionsResponseBody build() {
            return new ListGeographicSubRegionsResponseBody(this);
        } 

    } 

}
