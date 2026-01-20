// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateRspDomainServerProhibitStatusForGatewayOteRequest} extends {@link RequestModel}
 *
 * <p>UpdateRspDomainServerProhibitStatusForGatewayOteRequest</p>
 */
public class UpdateRspDomainServerProhibitStatusForGatewayOteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddStatusList")
    private java.util.List<AddStatusList> addStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteStatusList")
    private java.util.List<DeleteStatusList> deleteStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private UpdateRspDomainServerProhibitStatusForGatewayOteRequest(Builder builder) {
        super(builder);
        this.addStatusList = builder.addStatusList;
        this.clientToken = builder.clientToken;
        this.deleteStatusList = builder.deleteStatusList;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRspDomainServerProhibitStatusForGatewayOteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addStatusList
     */
    public java.util.List<AddStatusList> getAddStatusList() {
        return this.addStatusList;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deleteStatusList
     */
    public java.util.List<DeleteStatusList> getDeleteStatusList() {
        return this.deleteStatusList;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<UpdateRspDomainServerProhibitStatusForGatewayOteRequest, Builder> {
        private java.util.List<AddStatusList> addStatusList; 
        private String clientToken; 
        private java.util.List<DeleteStatusList> deleteStatusList; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRspDomainServerProhibitStatusForGatewayOteRequest request) {
            super(request);
            this.addStatusList = request.addStatusList;
            this.clientToken = request.clientToken;
            this.deleteStatusList = request.deleteStatusList;
            this.domainName = request.domainName;
        } 

        /**
         * AddStatusList.
         */
        public Builder addStatusList(java.util.List<AddStatusList> addStatusList) {
            this.putQueryParameter("AddStatusList", addStatusList);
            this.addStatusList = addStatusList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwoefasdf</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DeleteStatusList.
         */
        public Builder deleteStatusList(java.util.List<DeleteStatusList> deleteStatusList) {
            this.putQueryParameter("DeleteStatusList", deleteStatusList);
            this.deleteStatusList = deleteStatusList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public UpdateRspDomainServerProhibitStatusForGatewayOteRequest build() {
            return new UpdateRspDomainServerProhibitStatusForGatewayOteRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRspDomainServerProhibitStatusForGatewayOteRequest} extends {@link TeaModel}
     *
     * <p>UpdateRspDomainServerProhibitStatusForGatewayOteRequest</p>
     */
    public static class AddStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMsg")
        private String statusMsg;

        private AddStatusList(Builder builder) {
            this.status = builder.status;
            this.statusMsg = builder.statusMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddStatusList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMsg
         */
        public String getStatusMsg() {
            return this.statusMsg;
        }

        public static final class Builder {
            private String status; 
            private String statusMsg; 

            private Builder() {
            } 

            private Builder(AddStatusList model) {
                this.status = model.status;
                this.statusMsg = model.statusMsg;
            } 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusMsg.
             */
            public Builder statusMsg(String statusMsg) {
                this.statusMsg = statusMsg;
                return this;
            }

            public AddStatusList build() {
                return new AddStatusList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRspDomainServerProhibitStatusForGatewayOteRequest} extends {@link TeaModel}
     *
     * <p>UpdateRspDomainServerProhibitStatusForGatewayOteRequest</p>
     */
    public static class DeleteStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMsg")
        private String statusMsg;

        private DeleteStatusList(Builder builder) {
            this.status = builder.status;
            this.statusMsg = builder.statusMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteStatusList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMsg
         */
        public String getStatusMsg() {
            return this.statusMsg;
        }

        public static final class Builder {
            private String status; 
            private String statusMsg; 

            private Builder() {
            } 

            private Builder(DeleteStatusList model) {
                this.status = model.status;
                this.statusMsg = model.statusMsg;
            } 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusMsg.
             */
            public Builder statusMsg(String statusMsg) {
                this.statusMsg = statusMsg;
                return this;
            }

            public DeleteStatusList build() {
                return new DeleteStatusList(this);
            } 

        } 

    }
}
