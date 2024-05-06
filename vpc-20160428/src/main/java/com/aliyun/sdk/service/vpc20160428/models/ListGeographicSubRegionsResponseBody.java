// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeographicSubRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGeographicSubRegionsResponseBody</p>
 */
public class ListGeographicSubRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("GeographicSubRegions")
    private java.util.List < String > geographicSubRegions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The number of entries.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * The region list.
         */
        public Builder geographicSubRegions(java.util.List < String > geographicSubRegions) {
            this.geographicSubRegions = geographicSubRegions;
            return this;
        }

        /**
         * The request ID.
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
