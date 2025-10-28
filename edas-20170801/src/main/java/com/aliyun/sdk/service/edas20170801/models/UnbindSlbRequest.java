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
 * {@link UnbindSlbRequest} extends {@link RequestModel}
 *
 * <p>UnbindSlbRequest</p>
 */
public class UnbindSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteListener")
    private String deleteListener;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UnbindSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deleteListener = builder.deleteListener;
        this.slbId = builder.slbId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindSlbRequest create() {
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
     * @return deleteListener
     */
    public String getDeleteListener() {
        return this.deleteListener;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UnbindSlbRequest, Builder> {
        private String appId; 
        private String deleteListener; 
        private String slbId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UnbindSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.deleteListener = request.deleteListener;
            this.slbId = request.slbId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c627c157-560d-********************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Specifies whether to remove the configured listeners. Valid values:</p>
         * <ul>
         * <li>true: removes the configured listeners.</li>
         * <li>false: does not remove the configured listeners.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteListener(String deleteListener) {
            this.putQueryParameter("DeleteListener", deleteListener);
            this.deleteListener = deleteListener;
            return this;
        }

        /**
         * <p>The ID of the SLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-wz9vo49****************</p>
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * <p>The network type of the SLB instance. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: Internet-facing SLB instance</li>
         * <li><strong>intranet</strong>: internal-facing SLB instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UnbindSlbRequest build() {
            return new UnbindSlbRequest(this);
        } 

    } 

}
