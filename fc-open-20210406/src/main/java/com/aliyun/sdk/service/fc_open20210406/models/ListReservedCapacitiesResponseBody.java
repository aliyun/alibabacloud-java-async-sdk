// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListReservedCapacitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListReservedCapacitiesResponseBody</p>
 */
public class ListReservedCapacitiesResponseBody extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("reservedCapacities")
    private java.util.List < OpenReservedCapacity > reservedCapacities;

    private ListReservedCapacitiesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.reservedCapacities = builder.reservedCapacities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReservedCapacitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return reservedCapacities
     */
    public java.util.List < OpenReservedCapacity > getReservedCapacities() {
        return this.reservedCapacities;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < OpenReservedCapacity > reservedCapacities; 

        /**
         * The pagination token to request the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about subscription instances.
         */
        public Builder reservedCapacities(java.util.List < OpenReservedCapacity > reservedCapacities) {
            this.reservedCapacities = reservedCapacities;
            return this;
        }

        public ListReservedCapacitiesResponseBody build() {
            return new ListReservedCapacitiesResponseBody(this);
        } 

    } 

}
