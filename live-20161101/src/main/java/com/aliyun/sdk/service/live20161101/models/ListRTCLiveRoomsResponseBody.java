// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRTCLiveRoomsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRTCLiveRoomsResponseBody</p>
 */
public class ListRTCLiveRoomsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rooms")
    private java.util.List<String> rooms;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListRTCLiveRoomsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rooms = builder.rooms;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRTCLiveRoomsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rooms
     */
    public java.util.List<String> getRooms() {
        return this.rooms;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> rooms; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListRTCLiveRoomsResponseBody model) {
            this.requestId = model.requestId;
            this.rooms = model.rooms;
            this.total = model.total;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64-af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rooms.
         */
        public Builder rooms(java.util.List<String> rooms) {
            this.rooms = rooms;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListRTCLiveRoomsResponseBody build() {
            return new ListRTCLiveRoomsResponseBody(this);
        } 

    } 

}
