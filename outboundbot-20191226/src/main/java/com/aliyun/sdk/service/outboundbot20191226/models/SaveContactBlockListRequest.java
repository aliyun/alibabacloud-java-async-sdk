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
         * <p>The list of contacts. [Deprecated]</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder contactBlockListList(java.util.List<String> contactBlockListList) {
            this.putQueryParameter("ContactBlockListList", contactBlockListList);
            this.contactBlockListList = contactBlockListList;
            return this;
        }

        /**
         * <p>A JSON string that contains the blocklist. This parameter is required.</p>
         * <ul>
         * <li><p>phoneNumber: The mobile phone number.</p>
         * </li>
         * <li><p>remark: The remarks.</p>
         * </li>
         * <li><p>name: The name.</p>
         * </li>
         * <li><p>creator: The creator.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;phoneNumber&quot;:&quot;132322&quot;,&quot;remark&quot;:&quot;123321&quot;,&quot;name&quot;:&quot;ccc1&quot;,&quot;creator&quot;:&quot;ccc222&quot;}]</p>
         */
        public Builder contactBlockListsJson(String contactBlockListsJson) {
            this.putQueryParameter("ContactBlockListsJson", contactBlockListsJson);
            this.contactBlockListsJson = contactBlockListsJson;
            return this;
        }

        /**
         * <p>The instance ID. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c3c92de8-e4bd-4db4-a962-50f8acce40bc</p>
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
