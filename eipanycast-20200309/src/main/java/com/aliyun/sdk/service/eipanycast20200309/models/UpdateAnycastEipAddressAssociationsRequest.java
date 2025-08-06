// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

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
 * {@link UpdateAnycastEipAddressAssociationsRequest} extends {@link RequestModel}
 *
 * <p>UpdateAnycastEipAddressAssociationsRequest</p>
 */
public class UpdateAnycastEipAddressAssociationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnycastId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String anycastId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociationMode")
    private String associationMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PopLocationAddList")
    private java.util.List<PopLocationAddList> popLocationAddList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PopLocationDeleteList")
    private java.util.List<PopLocationDeleteList> popLocationDeleteList;

    private UpdateAnycastEipAddressAssociationsRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.associationMode = builder.associationMode;
        this.bindInstanceId = builder.bindInstanceId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.popLocationAddList = builder.popLocationAddList;
        this.popLocationDeleteList = builder.popLocationDeleteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAnycastEipAddressAssociationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return associationMode
     */
    public String getAssociationMode() {
        return this.associationMode;
    }

    /**
     * @return bindInstanceId
     */
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return popLocationAddList
     */
    public java.util.List<PopLocationAddList> getPopLocationAddList() {
        return this.popLocationAddList;
    }

    /**
     * @return popLocationDeleteList
     */
    public java.util.List<PopLocationDeleteList> getPopLocationDeleteList() {
        return this.popLocationDeleteList;
    }

    public static final class Builder extends Request.Builder<UpdateAnycastEipAddressAssociationsRequest, Builder> {
        private String anycastId; 
        private String associationMode; 
        private String bindInstanceId; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<PopLocationAddList> popLocationAddList; 
        private java.util.List<PopLocationDeleteList> popLocationDeleteList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAnycastEipAddressAssociationsRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.associationMode = request.associationMode;
            this.bindInstanceId = request.bindInstanceId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.popLocationAddList = request.popLocationAddList;
            this.popLocationDeleteList = request.popLocationDeleteList;
        } 

        /**
         * <p>The ID of the Anycast EIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aeip-bp1ix34fralt4ykf3****</p>
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>The association mode. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong>: the default mode. In this mode, cloud resources to be associated are set as default origin servers.</li>
         * <li><strong>Normal</strong>: the standard mode. In this mode, cloud resources to be associated are set as standard origin servers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder associationMode(String associationMode) {
            this.putQueryParameter("AssociationMode", associationMode);
            this.associationMode = associationMode;
            return this;
        }

        /**
         * <p>The ID of the cloud resource with which you want to associate the Anycast EIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-d7oxbixhxv1uupnon****</p>
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the system automatically uses <strong>RequestId</strong> as <strong>ClientToken</strong>. <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request without updating the association information. The system checks the required parameters, request syntax, and limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends the API request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The access areas and access points to be added.</p>
         */
        public Builder popLocationAddList(java.util.List<PopLocationAddList> popLocationAddList) {
            this.putQueryParameter("PopLocationAddList", popLocationAddList);
            this.popLocationAddList = popLocationAddList;
            return this;
        }

        /**
         * <p>The access areas and access points to be deleted.</p>
         */
        public Builder popLocationDeleteList(java.util.List<PopLocationDeleteList> popLocationDeleteList) {
            this.putQueryParameter("PopLocationDeleteList", popLocationDeleteList);
            this.popLocationDeleteList = popLocationDeleteList;
            return this;
        }

        @Override
        public UpdateAnycastEipAddressAssociationsRequest build() {
            return new UpdateAnycastEipAddressAssociationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAnycastEipAddressAssociationsRequest} extends {@link TeaModel}
     *
     * <p>UpdateAnycastEipAddressAssociationsRequest</p>
     */
    public static class PopLocationAddList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PopLocation")
        private String popLocation;

        private PopLocationAddList(Builder builder) {
            this.popLocation = builder.popLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopLocationAddList create() {
            return builder().build();
        }

        /**
         * @return popLocation
         */
        public String getPopLocation() {
            return this.popLocation;
        }

        public static final class Builder {
            private String popLocation; 

            private Builder() {
            } 

            private Builder(PopLocationAddList model) {
                this.popLocation = model.popLocation;
            } 

            /**
             * <p>The access points in the access areas to be added.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/171938.html">DescribeAnycastPopLocations</a> operation to query the access points in supported access areas.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1-pop</p>
             */
            public Builder popLocation(String popLocation) {
                this.popLocation = popLocation;
                return this;
            }

            public PopLocationAddList build() {
                return new PopLocationAddList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAnycastEipAddressAssociationsRequest} extends {@link TeaModel}
     *
     * <p>UpdateAnycastEipAddressAssociationsRequest</p>
     */
    public static class PopLocationDeleteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PopLocation")
        private String popLocation;

        private PopLocationDeleteList(Builder builder) {
            this.popLocation = builder.popLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopLocationDeleteList create() {
            return builder().build();
        }

        /**
         * @return popLocation
         */
        public String getPopLocation() {
            return this.popLocation;
        }

        public static final class Builder {
            private String popLocation; 

            private Builder() {
            } 

            private Builder(PopLocationDeleteList model) {
                this.popLocation = model.popLocation;
            } 

            /**
             * <p>The access points in the access areas to be deleted.</p>
             * <blockquote>
             * <p> If the access point in the access area is associated with a default origin server, you cannot delete the access point in the access area.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>eu-west-1-pop</p>
             */
            public Builder popLocation(String popLocation) {
                this.popLocation = popLocation;
                return this;
            }

            public PopLocationDeleteList build() {
                return new PopLocationDeleteList(this);
            } 

        } 

    }
}
