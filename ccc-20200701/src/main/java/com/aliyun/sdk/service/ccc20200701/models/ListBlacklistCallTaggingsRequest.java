// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListBlacklistCallTaggingsRequest} extends {@link RequestModel}
 *
 * <p>ListBlacklistCallTaggingsRequest</p>
 */
public class ListBlacklistCallTaggingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String numberList;

    private ListBlacklistCallTaggingsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.numberList = builder.numberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBlacklistCallTaggingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    public static final class Builder extends Request.Builder<ListBlacklistCallTaggingsRequest, Builder> {
        private String instanceId; 
        private String numberList; 

        private Builder() {
            super();
        } 

        private Builder(ListBlacklistCallTaggingsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.numberList = request.numberList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;number&quot;:&quot;1521083xxxx&quot;,&quot;jobId&quot;:&quot;job-481841171213393920&quot;}]</p>
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        @Override
        public ListBlacklistCallTaggingsRequest build() {
            return new ListBlacklistCallTaggingsRequest(this);
        } 

    } 

}
