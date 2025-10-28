// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetK8sApplicationRequest</p>
 */
public class GetK8sApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    private GetK8sApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetK8sApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<GetK8sApplicationRequest, Builder> {
        private String appId; 
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(GetK8sApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.from = request.from;
        } 

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5a166fbd-<strong><strong>-4f98-a286-781659d9</strong></strong></p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The source from which data is queried.</p>
         * <ul>
         * <li>If you leave this parameter empty, a common query is performed.</li>
         * <li>If you set the value to deploy, you query application information from the deployment page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deploy</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        @Override
        public GetK8sApplicationRequest build() {
            return new GetK8sApplicationRequest(this);
        } 

    } 

}
