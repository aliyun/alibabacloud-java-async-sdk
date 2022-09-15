// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link BatchUpdateEtlMetaRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateEtlMetaRequest</p>
 */
public class BatchUpdateEtlMetaRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("etlMetaList")
    private EtlMetaList etlMetaList;

    private BatchUpdateEtlMetaRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.etlMetaList = builder.etlMetaList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateEtlMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return etlMetaList
     */
    public EtlMetaList getEtlMetaList() {
        return this.etlMetaList;
    }

    public static final class Builder extends Request.Builder<BatchUpdateEtlMetaRequest, Builder> {
        private String project; 
        private EtlMetaList etlMetaList; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateEtlMetaRequest request) {
            super(request);
            this.project = request.project;
            this.etlMetaList = request.etlMetaList;
        } 

        /**
         * project 名称
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * etlMetaList.
         */
        public Builder etlMetaList(EtlMetaList etlMetaList) {
            this.putBodyParameter("etlMetaList", etlMetaList);
            this.etlMetaList = etlMetaList;
            return this;
        }

        @Override
        public BatchUpdateEtlMetaRequest build() {
            return new BatchUpdateEtlMetaRequest(this);
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
             * 是否启用。etlMetaTag、etlMetaValue、enable 至少需要存在一个。
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * key。由 ascii 可打印字符组成，包括数字、英文大小写字母、下划线、连字符、英文标点符号等组成，长度在[1,255]之间。
             */
            public Builder etlMetaKey(String etlMetaKey) {
                this.etlMetaKey = etlMetaKey;
                return this;
            }

            /**
             * 名字。由数字、大小写字母、下划线_、连字符-组成，长度需要在[2,64]之间。
             */
            public Builder etlMetaName(String etlMetaName) {
                this.etlMetaName = etlMetaName;
                return this;
            }

            /**
             * key。由 ascii 可打印字符组成，包括数字、英文大小写字母、下划线、连字符、英文标点符号等组成，长度在[1,128]之间。
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
