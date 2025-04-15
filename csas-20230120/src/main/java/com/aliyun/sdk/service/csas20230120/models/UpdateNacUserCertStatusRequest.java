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
         * IdList.
         */
        public Builder idList(java.util.List<IdList> idList) {
            this.putBodyParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * Status.
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
             * DevTag.
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * UserId.
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
