// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallSummariesRequest} extends {@link RequestModel}
 *
 * <p>ListCallSummariesRequest</p>
 */
public class ListCallSummariesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactIdList")
    private java.util.List < String > contactIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ListCallSummariesRequest(Builder builder) {
        super(builder);
        this.contactIdList = builder.contactIdList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallSummariesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactIdList
     */
    public java.util.List < String > getContactIdList() {
        return this.contactIdList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListCallSummariesRequest, Builder> {
        private java.util.List < String > contactIdList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListCallSummariesRequest request) {
            super(request);
            this.contactIdList = request.contactIdList;
            this.instanceId = request.instanceId;
        } 

        /**
         * ContactIdList.
         */
        public Builder contactIdList(java.util.List < String > contactIdList) {
            String contactIdListShrink = shrink(contactIdList, "ContactIdList", "json");
            this.putQueryParameter("ContactIdList", contactIdListShrink);
            this.contactIdList = contactIdList;
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
        public ListCallSummariesRequest build() {
            return new ListCallSummariesRequest(this);
        } 

    } 

}
