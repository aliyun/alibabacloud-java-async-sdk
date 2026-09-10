// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link PostInnerConvertRequest} extends {@link RequestModel}
 *
 * <p>PostInnerConvertRequest</p>
 */
public class PostInnerConvertRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sqlConvertMap")
    private java.util.Map<String, ?> sqlConvertMap;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDataSourceName")
    private String srcDataSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tgtDataSourceName")
    private String tgtDataSourceName;

    private PostInnerConvertRequest(Builder builder) {
        super(builder);
        this.sqlConvertMap = builder.sqlConvertMap;
        this.srcDataSourceName = builder.srcDataSourceName;
        this.tgtDataSourceName = builder.tgtDataSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostInnerConvertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sqlConvertMap
     */
    public java.util.Map<String, ?> getSqlConvertMap() {
        return this.sqlConvertMap;
    }

    /**
     * @return srcDataSourceName
     */
    public String getSrcDataSourceName() {
        return this.srcDataSourceName;
    }

    /**
     * @return tgtDataSourceName
     */
    public String getTgtDataSourceName() {
        return this.tgtDataSourceName;
    }

    public static final class Builder extends Request.Builder<PostInnerConvertRequest, Builder> {
        private java.util.Map<String, ?> sqlConvertMap; 
        private String srcDataSourceName; 
        private String tgtDataSourceName; 

        private Builder() {
            super();
        } 

        private Builder(PostInnerConvertRequest request) {
            super(request);
            this.sqlConvertMap = request.sqlConvertMap;
            this.srcDataSourceName = request.srcDataSourceName;
            this.tgtDataSourceName = request.tgtDataSourceName;
        } 

        /**
         * <p>SQL node type mapping, where the key is the source node type and the value is the target node type. If not empty, it will be assembled into <code>workflow.converter.sqlNodeTypeMapping</code> in <code>innerConvertConfig</code> and written via the task configuration update interface after creating the scheduling transformation task.</p>
         */
        public Builder sqlConvertMap(java.util.Map<String, ?> sqlConvertMap) {
            this.putBodyParameter("sqlConvertMap", sqlConvertMap);
            this.sqlConvertMap = sqlConvertMap;
            return this;
        }

        /**
         * <p>Source data source name, i.e., the name of the scheduling data source at the source end of the transformation task.</p>
         * 
         * <strong>example:</strong>
         * <p>SourceDS1</p>
         */
        public Builder srcDataSourceName(String srcDataSourceName) {
            this.putBodyParameter("srcDataSourceName", srcDataSourceName);
            this.srcDataSourceName = srcDataSourceName;
            return this;
        }

        /**
         * <p>Target data source name, i.e., the name of the scheduling data source at the target end of the transformation task.</p>
         * 
         * <strong>example:</strong>
         * <p>TargetDS1</p>
         */
        public Builder tgtDataSourceName(String tgtDataSourceName) {
            this.putBodyParameter("tgtDataSourceName", tgtDataSourceName);
            this.tgtDataSourceName = tgtDataSourceName;
            return this;
        }

        @Override
        public PostInnerConvertRequest build() {
            return new PostInnerConvertRequest(this);
        } 

    } 

}
