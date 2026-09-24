// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListDiagnosisItemsRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnosisItemsRequest</p>
 */
public class ListDiagnosisItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    private ListDiagnosisItemsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.level = builder.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosisItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    public static final class Builder extends Request.Builder<ListDiagnosisItemsRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String level; 

        private Builder() {
            super();
        } 

        private Builder(ListDiagnosisItemsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.level = request.level;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-v0h14zdee000mimee</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The supported request language. Default value: the browser request language. Valid values:</p>
         * <ul>
         * <li>en: English</li>
         * <li>zh: Simplified Chinese</li>
         * <li>zt: Traditional Chinese</li>
         * <li>es: Spanish</li>
         * <li>fr: French</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The diagnostic item level. Valid values:</p>
         * <ul>
         * <li>BASIC: basic inspection item (free).</li>
         * <li>ADVANCED: advanced inspection item (consumes billable tokens).</li>
         * </ul>
         * <p>If this parameter is not specified, diagnostic items of all levels are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("level", level);
            this.level = level;
            return this;
        }

        @Override
        public ListDiagnosisItemsRequest build() {
            return new ListDiagnosisItemsRequest(this);
        } 

    } 

}
