// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link AddVirusScanAdditionalListsResponseBody} extends {@link TeaModel}
 *
 * <p>AddVirusScanAdditionalListsResponseBody</p>
 */
public class AddVirusScanAdditionalListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListIds")
    private java.util.List<String> listIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddVirusScanAdditionalListsResponseBody(Builder builder) {
        this.listIds = builder.listIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVirusScanAdditionalListsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listIds
     */
    public java.util.List<String> getListIds() {
        return this.listIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> listIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddVirusScanAdditionalListsResponseBody model) {
            this.listIds = model.listIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the added list entries. The order of the IDs is the same as the order of the entries in the AdditionalLists parameter of the request.</p>
         */
        public Builder listIds(java.util.List<String> listIds) {
            this.listIds = listIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddVirusScanAdditionalListsResponseBody build() {
            return new AddVirusScanAdditionalListsResponseBody(this);
        } 

    } 

}
