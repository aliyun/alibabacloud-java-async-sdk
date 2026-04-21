// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ExecuteAutoDisposeRecordsRequest} extends {@link RequestModel}
 *
 * <p>ExecuteAutoDisposeRecordsRequest</p>
 */
public class ExecuteAutoDisposeRecordsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SelectedEntityList")
    private java.util.List<SelectedEntityList> selectedEntityList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnSelectedEntityList")
    private java.util.List<UnSelectedEntityList> unSelectedEntityList;

    private ExecuteAutoDisposeRecordsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.selectedEntityList = builder.selectedEntityList;
        this.unSelectedEntityList = builder.unSelectedEntityList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAutoDisposeRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return selectedEntityList
     */
    public java.util.List<SelectedEntityList> getSelectedEntityList() {
        return this.selectedEntityList;
    }

    /**
     * @return unSelectedEntityList
     */
    public java.util.List<UnSelectedEntityList> getUnSelectedEntityList() {
        return this.unSelectedEntityList;
    }

    public static final class Builder extends Request.Builder<ExecuteAutoDisposeRecordsRequest, Builder> {
        private String lang; 
        private java.util.List<SelectedEntityList> selectedEntityList; 
        private java.util.List<UnSelectedEntityList> unSelectedEntityList; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteAutoDisposeRecordsRequest request) {
            super(request);
            this.lang = request.lang;
            this.selectedEntityList = request.selectedEntityList;
            this.unSelectedEntityList = request.unSelectedEntityList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SelectedEntityList.
         */
        public Builder selectedEntityList(java.util.List<SelectedEntityList> selectedEntityList) {
            this.putBodyParameter("SelectedEntityList", selectedEntityList);
            this.selectedEntityList = selectedEntityList;
            return this;
        }

        /**
         * UnSelectedEntityList.
         */
        public Builder unSelectedEntityList(java.util.List<UnSelectedEntityList> unSelectedEntityList) {
            this.putBodyParameter("UnSelectedEntityList", unSelectedEntityList);
            this.unSelectedEntityList = unSelectedEntityList;
            return this;
        }

        @Override
        public ExecuteAutoDisposeRecordsRequest build() {
            return new ExecuteAutoDisposeRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteAutoDisposeRecordsRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAutoDisposeRecordsRequest</p>
     */
    public static class SelectedEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDisposeRecordId")
        private String autoDisposeRecordId;

        @com.aliyun.core.annotation.NameInMap("EntityUuid")
        private String entityUuid;

        private SelectedEntityList(Builder builder) {
            this.autoDisposeRecordId = builder.autoDisposeRecordId;
            this.entityUuid = builder.entityUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedEntityList create() {
            return builder().build();
        }

        /**
         * @return autoDisposeRecordId
         */
        public String getAutoDisposeRecordId() {
            return this.autoDisposeRecordId;
        }

        /**
         * @return entityUuid
         */
        public String getEntityUuid() {
            return this.entityUuid;
        }

        public static final class Builder {
            private String autoDisposeRecordId; 
            private String entityUuid; 

            private Builder() {
            } 

            private Builder(SelectedEntityList model) {
                this.autoDisposeRecordId = model.autoDisposeRecordId;
                this.entityUuid = model.entityUuid;
            } 

            /**
             * AutoDisposeRecordId.
             */
            public Builder autoDisposeRecordId(String autoDisposeRecordId) {
                this.autoDisposeRecordId = autoDisposeRecordId;
                return this;
            }

            /**
             * EntityUuid.
             */
            public Builder entityUuid(String entityUuid) {
                this.entityUuid = entityUuid;
                return this;
            }

            public SelectedEntityList build() {
                return new SelectedEntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteAutoDisposeRecordsRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAutoDisposeRecordsRequest</p>
     */
    public static class UnSelectedEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDisposeRecordId")
        private String autoDisposeRecordId;

        @com.aliyun.core.annotation.NameInMap("EntityUuid")
        private String entityUuid;

        private UnSelectedEntityList(Builder builder) {
            this.autoDisposeRecordId = builder.autoDisposeRecordId;
            this.entityUuid = builder.entityUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnSelectedEntityList create() {
            return builder().build();
        }

        /**
         * @return autoDisposeRecordId
         */
        public String getAutoDisposeRecordId() {
            return this.autoDisposeRecordId;
        }

        /**
         * @return entityUuid
         */
        public String getEntityUuid() {
            return this.entityUuid;
        }

        public static final class Builder {
            private String autoDisposeRecordId; 
            private String entityUuid; 

            private Builder() {
            } 

            private Builder(UnSelectedEntityList model) {
                this.autoDisposeRecordId = model.autoDisposeRecordId;
                this.entityUuid = model.entityUuid;
            } 

            /**
             * AutoDisposeRecordId.
             */
            public Builder autoDisposeRecordId(String autoDisposeRecordId) {
                this.autoDisposeRecordId = autoDisposeRecordId;
                return this;
            }

            /**
             * EntityUuid.
             */
            public Builder entityUuid(String entityUuid) {
                this.entityUuid = entityUuid;
                return this;
            }

            public UnSelectedEntityList build() {
                return new UnSelectedEntityList(this);
            } 

        } 

    }
}
