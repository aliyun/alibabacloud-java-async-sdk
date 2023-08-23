// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAddressBookResponseBody} extends {@link TeaModel}
 *
 * <p>AddAddressBookResponseBody</p>
 */
public class AddAddressBookResponseBody extends TeaModel {
    @NameInMap("GroupUuid")
    private String groupUuid;

    @NameInMap("RequestId")
    private String requestId;

    private AddAddressBookResponseBody(Builder builder) {
        this.groupUuid = builder.groupUuid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAddressBookResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String groupUuid; 
        private String requestId; 

        /**
         * The UUID of the returned address book.
         */
        public Builder groupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddAddressBookResponseBody build() {
            return new AddAddressBookResponseBody(this);
        } 

    } 

}
