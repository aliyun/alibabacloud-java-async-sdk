// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link AddAddressBookResponseBody} extends {@link TeaModel}
 *
 * <p>AddAddressBookResponseBody</p>
 */
public class AddAddressBookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupUuid")
    private String groupUuid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddAddressBookResponseBody model) {
            this.groupUuid = model.groupUuid;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The UUID of the returned address book.</p>
         * 
         * <strong>example:</strong>
         * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
         */
        public Builder groupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2****</p>
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
