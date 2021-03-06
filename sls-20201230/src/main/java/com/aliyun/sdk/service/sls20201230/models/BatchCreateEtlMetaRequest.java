// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link BatchCreateEtlMetaRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateEtlMetaRequest</p>
 */
public class BatchCreateEtlMetaRequest extends Request {
    @Body
    @NameInMap("etlMetaList")
    @Validation(required = true)
    private java.util.List < EtlMetaList> etlMetaList;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private BatchCreateEtlMetaRequest(Builder builder) {
        super(builder);
        this.etlMetaList = builder.etlMetaList;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateEtlMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return etlMetaList
     */
    public java.util.List < EtlMetaList> getEtlMetaList() {
        return this.etlMetaList;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<BatchCreateEtlMetaRequest, Builder> {
        private java.util.List < EtlMetaList> etlMetaList; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateEtlMetaRequest request) {
            super(request);
            this.etlMetaList = request.etlMetaList;
            this.project = request.project;
        } 

        /**
         * etlMetaList.
         */
        public Builder etlMetaList(java.util.List < EtlMetaList> etlMetaList) {
            this.putBodyParameter("etlMetaList", etlMetaList);
            this.etlMetaList = etlMetaList;
            return this;
        }

        /**
         * project ??????
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public BatchCreateEtlMetaRequest build() {
            return new BatchCreateEtlMetaRequest(this);
        } 

    } 

    public static class EtlMetaList extends TeaModel {
        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("etlMetaKey")
        @Validation(required = true)
        private String etlMetaKey;

        @NameInMap("etlMetaName")
        @Validation(required = true)
        private String etlMetaName;

        @NameInMap("etlMetaTag")
        @Validation(required = true)
        private String etlMetaTag;

        @NameInMap("etlMetaValue")
        private java.util.Map < String, ? > etlMetaValue;

        private EtlMetaList(Builder builder) {
            this.enable = builder.enable;
            this.etlMetaKey = builder.etlMetaKey;
            this.etlMetaName = builder.etlMetaName;
            this.etlMetaTag = builder.etlMetaTag;
            this.etlMetaValue = builder.etlMetaValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlMetaList create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return etlMetaKey
         */
        public String getEtlMetaKey() {
            return this.etlMetaKey;
        }

        /**
         * @return etlMetaName
         */
        public String getEtlMetaName() {
            return this.etlMetaName;
        }

        /**
         * @return etlMetaTag
         */
        public String getEtlMetaTag() {
            return this.etlMetaTag;
        }

        /**
         * @return etlMetaValue
         */
        public java.util.Map < String, ? > getEtlMetaValue() {
            return this.etlMetaValue;
        }

        public static final class Builder {
            private Boolean enable; 
            private String etlMetaKey; 
            private String etlMetaName; 
            private String etlMetaTag; 
            private java.util.Map < String, ? > etlMetaValue; 

            /**
             * ????????????
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * key?????? ascii ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????[1,255]?????????
             */
            public Builder etlMetaKey(String etlMetaKey) {
                this.etlMetaKey = etlMetaKey;
                return this;
            }

            /**
             * ????????????????????????????????????????????????_????????????-????????????????????????[2,64]?????????
             */
            public Builder etlMetaName(String etlMetaName) {
                this.etlMetaName = etlMetaName;
                return this;
            }

            /**
             * key?????? ascii ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????[1,128]?????????
             */
            public Builder etlMetaTag(String etlMetaTag) {
                this.etlMetaTag = etlMetaTag;
                return this;
            }

            /**
             * etlMetaValue.
             */
            public Builder etlMetaValue(java.util.Map < String, ? > etlMetaValue) {
                this.etlMetaValue = etlMetaValue;
                return this;
            }

            public EtlMetaList build() {
                return new EtlMetaList(this);
            } 

        } 

    }
}
