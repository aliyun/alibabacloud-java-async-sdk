// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeGraph4InvestigationOnlineRequest} extends {@link RequestModel}
 *
 * <p>DescribeGraph4InvestigationOnlineRequest</p>
 */
public class DescribeGraph4InvestigationOnlineRequest extends Request {
    @Query
    @NameInMap("AnomalyId")
    private String anomalyId;

    @Query
    @NameInMap("AnomalyUuid")
    private String anomalyUuid;

    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PathLength")
    private Integer pathLength;

    @Query
    @NameInMap("VertexId")
    private String vertexId;


    private DescribeGraph4InvestigationOnlineRequest(Builder builder) {
        super(builder);
        this.anomalyId = builder.anomalyId;
        this.anomalyUuid = builder.anomalyUuid;
        this.direction = builder.direction;
        this.lang = builder.lang;
        this.namespace = builder.namespace;
        this.pathLength = builder.pathLength;
        this.vertexId = builder.vertexId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGraph4InvestigationOnlineRequest create() {
        return builder().build();
    }

    /**
     * @return anomalyId
     */
    public String getAnomalyId() {
        return this.anomalyId;
    }

    /**
     * @return anomalyUuid
     */
    public String getAnomalyUuid() {
        return this.anomalyUuid;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pathLength
     */
    public Integer getPathLength() {
        return this.pathLength;
    }

    /**
     * @return vertexId
     */
    public String getVertexId() {
        return this.vertexId;
    }

    public static final class Builder extends Request.Builder {
        private String anomalyId; 
        private String anomalyUuid; 
        private String direction; 
        private String lang; 
        private String namespace; 
        private Integer pathLength; 
        private String vertexId; 

        /**
         * <p>AnomalyId.</p>
         */
        public Builder anomalyId(String anomalyId) {
            this.putQueryParameter("AnomalyId", anomalyId);
            this.anomalyId = anomalyId;
            return this;
        }

        /**
         * <p>AnomalyUuid.</p>
         */
        public Builder anomalyUuid(String anomalyUuid) {
            this.putQueryParameter("AnomalyUuid", anomalyUuid);
            this.anomalyUuid = anomalyUuid;
            return this;
        }

        /**
         * <p>Direction.</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Namespace.</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>PathLength.</p>
         */
        public Builder pathLength(Integer pathLength) {
            this.putQueryParameter("PathLength", pathLength);
            this.pathLength = pathLength;
            return this;
        }

        /**
         * <p>VertexId.</p>
         */
        public Builder vertexId(String vertexId) {
            this.putQueryParameter("VertexId", vertexId);
            this.vertexId = vertexId;
            return this;
        }

        public DescribeGraph4InvestigationOnlineRequest build() {
            return new DescribeGraph4InvestigationOnlineRequest(this);
        } 

    } 

}
