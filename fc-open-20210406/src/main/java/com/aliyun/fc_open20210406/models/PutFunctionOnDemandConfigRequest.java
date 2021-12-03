// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutFunctionOnDemandConfigRequest} extends {@link RequestModel}
 *
 * <p>PutFunctionOnDemandConfigRequest</p>
 */
public class PutFunctionOnDemandConfigRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;

    @Body
    @NameInMap("maximumInstanceCount")
    private Long maximumInstanceCount;

    @Query
    @NameInMap("qualifier")
    private String qualifier;


    private PutFunctionOnDemandConfigRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.ifMatch = builder.ifMatch;
        this.maximumInstanceCount = builder.maximumInstanceCount;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutFunctionOnDemandConfigRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * @return maximumInstanceCount
     */
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private String ifMatch; 
        private Long maximumInstanceCount; 
        private String qualifier; 

        /**
         * <p>serviceName.</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>functionName.</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>If-Match.</p>
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * <p>maximumInstanceCount.</p>
         */
        public Builder maximumInstanceCount(Long maximumInstanceCount) {
            this.putBodyParameter("maximumInstanceCount", maximumInstanceCount);
            this.maximumInstanceCount = maximumInstanceCount;
            return this;
        }

        /**
         * <p>qualifier.</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        public PutFunctionOnDemandConfigRequest build() {
            return new PutFunctionOnDemandConfigRequest(this);
        } 

    } 

}
