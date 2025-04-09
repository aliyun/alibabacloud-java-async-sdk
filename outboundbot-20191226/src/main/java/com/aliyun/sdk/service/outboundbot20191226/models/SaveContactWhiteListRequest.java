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
 * {@link SaveContactWhiteListRequest} extends {@link RequestModel}
 *
 * <p>SaveContactWhiteListRequest</p>
 */
public class SaveContactWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactWhiteListList")
    private java.util.List<String> contactWhiteListList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactWhiteListsJson")
    private String contactWhiteListsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private SaveContactWhiteListRequest(Builder builder) {
        super(builder);
        this.contactWhiteListList = builder.contactWhiteListList;
        this.contactWhiteListsJson = builder.contactWhiteListsJson;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveContactWhiteListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactWhiteListList
     */
    public java.util.List<String> getContactWhiteListList() {
        return this.contactWhiteListList;
    }

    /**
     * @return contactWhiteListsJson
     */
    public String getContactWhiteListsJson() {
        return this.contactWhiteListsJson;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<SaveContactWhiteListRequest, Builder> {
        private java.util.List<String> contactWhiteListList; 
        private String contactWhiteListsJson; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveContactWhiteListRequest request) {
            super(request);
            this.contactWhiteListList = request.contactWhiteListList;
            this.contactWhiteListsJson = request.contactWhiteListsJson;
            this.instanceId = request.instanceId;
        } 

        /**
         * ContactWhiteListList.
         */
        public Builder contactWhiteListList(java.util.List<String> contactWhiteListList) {
            this.putQueryParameter("ContactWhiteListList", contactWhiteListList);
            this.contactWhiteListList = contactWhiteListList;
            return this;
        }

        /**
         * ContactWhiteListsJson.
         */
        public Builder contactWhiteListsJson(String contactWhiteListsJson) {
            this.putQueryParameter("ContactWhiteListsJson", contactWhiteListsJson);
            this.contactWhiteListsJson = contactWhiteListsJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c415bb6c-2e6f-46aa-afd9-3b65b6dbe2bc</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public SaveContactWhiteListRequest build() {
            return new SaveContactWhiteListRequest(this);
        } 

    } 

}
