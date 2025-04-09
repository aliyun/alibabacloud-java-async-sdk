// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link SaveContactBlockListRequest} extends {@link RequestModel}
 *
 * <p>SaveContactBlockListRequest</p>
 */
public class SaveContactBlockListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactBlockListList")
    private java.util.List<String> contactBlockListList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactBlockListsJson")
    private String contactBlockListsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private SaveContactBlockListRequest(Builder builder) {
        super(builder);
        this.contactBlockListList = builder.contactBlockListList;
        this.contactBlockListsJson = builder.contactBlockListsJson;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveContactBlockListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactBlockListList
     */
    public java.util.List<String> getContactBlockListList() {
        return this.contactBlockListList;
    }

    /**
     * @return contactBlockListsJson
     */
    public String getContactBlockListsJson() {
        return this.contactBlockListsJson;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<SaveContactBlockListRequest, Builder> {
        private java.util.List<String> contactBlockListList; 
        private String contactBlockListsJson; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveContactBlockListRequest request) {
            super(request);
            this.contactBlockListList = request.contactBlockListList;
            this.contactBlockListsJson = request.contactBlockListsJson;
            this.instanceId = request.instanceId;
        } 

        /**
         * ContactBlockListList.
         */
        public Builder contactBlockListList(java.util.List<String> contactBlockListList) {
            this.putQueryParameter("ContactBlockListList", contactBlockListList);
            this.contactBlockListList = contactBlockListList;
            return this;
        }

        /**
         * ContactBlockListsJson.
         */
        public Builder contactBlockListsJson(String contactBlockListsJson) {
            this.putQueryParameter("ContactBlockListsJson", contactBlockListsJson);
            this.contactBlockListsJson = contactBlockListsJson;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public SaveContactBlockListRequest build() {
            return new SaveContactBlockListRequest(this);
        } 

    } 

}
