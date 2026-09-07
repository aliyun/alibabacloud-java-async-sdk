// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateNacUserCertStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacUserCertStatusRequest</p>
 */
public class UpdateNacUserCertStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdList")
    private java.util.List<IdList> idList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateNacUserCertStatusRequest(Builder builder) {
        super(builder);
        this.idList = builder.idList;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNacUserCertStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idList
     */
    public java.util.List<IdList> getIdList() {
        return this.idList;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateNacUserCertStatusRequest, Builder> {
        private java.util.List<IdList> idList; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNacUserCertStatusRequest request) {
            super(request);
            this.idList = request.idList;
            this.status = request.status;
        } 

        /**
         * <p>A collection of end user IDs and device IDs.</p>
         */
        public Builder idList(java.util.List<IdList> idList) {
            this.putBodyParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * <p>The certificate status for the end user device. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong></p>
         * </li>
         * <li><p><strong>Disabled</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateNacUserCertStatusRequest build() {
            return new UpdateNacUserCertStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNacUserCertStatusRequest} extends {@link TeaModel}
     *
     * <p>UpdateNacUserCertStatusRequest</p>
     */
    public static class IdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private IdList(Builder builder) {
            this.devTag = builder.devTag;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdList create() {
            return builder().build();
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String devTag; 
            private String userId; 

            private Builder() {
            } 

            private Builder(IdList model) {
                this.devTag = model.devTag;
                this.userId = model.userId;
            } 

            /**
             * <p>The device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public IdList build() {
                return new IdList(this);
            } 

        } 

    }
}
