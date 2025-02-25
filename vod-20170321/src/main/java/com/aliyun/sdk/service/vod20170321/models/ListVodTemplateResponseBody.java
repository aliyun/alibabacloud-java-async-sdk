// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListVodTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListVodTemplateResponseBody</p>
 */
public class ListVodTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VodTemplateInfoList")
    private java.util.List<VodTemplateInfoList> vodTemplateInfoList;

    private ListVodTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vodTemplateInfoList = builder.vodTemplateInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vodTemplateInfoList
     */
    public java.util.List<VodTemplateInfoList> getVodTemplateInfoList() {
        return this.vodTemplateInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VodTemplateInfoList> vodTemplateInfoList; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2A56B75B-B7E6-48*****27-A9BEAA3E50A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The snapshot templates.</p>
         */
        public Builder vodTemplateInfoList(java.util.List<VodTemplateInfoList> vodTemplateInfoList) {
            this.vodTemplateInfoList = vodTemplateInfoList;
            return this;
        }

        public ListVodTemplateResponseBody build() {
            return new ListVodTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVodTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListVodTemplateResponseBody</p>
     */
    public static class VodTemplateInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private String templateConfig;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("VodTemplateId")
        private String vodTemplateId;

        private VodTemplateInfoList(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.isDefault = builder.isDefault;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.templateConfig = builder.templateConfig;
            this.templateType = builder.templateType;
            this.vodTemplateId = builder.vodTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VodTemplateInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return vodTemplateId
         */
        public String getVodTemplateId() {
            return this.vodTemplateId;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String isDefault; 
            private String modifyTime; 
            private String name; 
            private String templateConfig; 
            private String templateType; 
            private String vodTemplateId; 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the template was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-30T08:05:59:57Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the template is the default one. Valid values:</p>
             * <ul>
             * <li><strong>Default</strong>: The template is the default one.</li>
             * <li><strong>NotDefault</strong>: The template is not the default one.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NotDefault</p>
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The time when the template was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-30T09:05:59:97Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The detailed configurations of the template. The value is a JSON-formatted string. For more information about the data structure, see the &quot;SnapshotTemplateConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/98618.html">Media processing parameters</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;SnapshotConfig&quot;:{&quot;Count&quot;:10,&quot;SpecifiedOffsetTime&quot;:0,&quot;Interval&quot;:1},&quot;SnapshotType&quot;:&quot;NormalSnapshot&quot;}</p>
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The type of the template. Valid values:</p>
             * <ul>
             * <li><strong>Snapshot</strong></li>
             * <li><strong>DynamicImage</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Snapshot</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>7c49f2f42b1c*****0969fcd446690</p>
             */
            public Builder vodTemplateId(String vodTemplateId) {
                this.vodTemplateId = vodTemplateId;
                return this;
            }

            public VodTemplateInfoList build() {
                return new VodTemplateInfoList(this);
            } 

        } 

    }
}
