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
 * {@link ListDictsRequest} extends {@link RequestModel}
 *
 * <p>ListDictsRequest</p>
 */
public class ListDictsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("analyzerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String analyzerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ListDictsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.analyzerType = builder.analyzerType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDictsRequest create() {
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
     * @return analyzerType
     */
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ListDictsRequest, Builder> {
        private String instanceId; 
        private String analyzerType; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ListDictsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.analyzerType = request.analyzerType;
            this.name = request.name;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-0ju29ifnc0005****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The dictionary type. Valid values:</p>
         * <ul>
         * <li><p>IK: IK cold update dictionary.</p>
         * </li>
         * <li><p>IK_HOT: IK hot update dictionary.</p>
         * </li>
         * <li><p>SYNONYMS: Synonym dictionary.</p>
         * </li>
         * <li><p>ALIWS: Alibaba dictionary.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IK</p>
         */
        public Builder analyzerType(String analyzerType) {
            this.putQueryParameter("analyzerType", analyzerType);
            this.analyzerType = analyzerType;
            return this;
        }

        /**
         * <p>The file name used to filter results.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_MAIN.dic</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public ListDictsRequest build() {
            return new ListDictsRequest(this);
        } 

    } 

}
