// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindSlbRequest} extends {@link RequestModel}
 *
 * <p>UnbindSlbRequest</p>
 */
public class UnbindSlbRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("DeleteListener")
    private String deleteListener;

    @Query
    @NameInMap("SlbId")
    @Validation(required = true)
    private String slbId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Specifies whether to remove the configured listeners. Valid values:
         * <p>
         * 
         * *   true: removes the configured listeners.
         * *   false: does not remove the configured listeners.
         */
        public Builder deleteListener(String deleteListener) {
            this.putQueryParameter("DeleteListener", deleteListener);
            this.deleteListener = deleteListener;
            return this;
        }

        /**
         * The ID of the SLB instance.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * The network type of the SLB instance. Valid values:
         * <p>
         * 
         * *   **internet**: Internet-facing SLB instance
         * *   **intranet**: internal-facing SLB instance
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
