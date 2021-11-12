// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyNoticeConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyNoticeConfigRequest</p>
 */
public class ModifyNoticeConfigRequest extends Request {
    @Query
    @NameInMap("Project")
    private String project;

    @Query
    @NameInMap("Route")
    private Integer route;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TimeLimit")
    private Integer timeLimit;


    private ModifyNoticeConfigRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.route = builder.route;
        this.sourceIp = builder.sourceIp;
        this.timeLimit = builder.timeLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNoticeConfigRequest create() {
        return builder().build();
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return route
     */
    public Integer getRoute() {
        return this.route;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return timeLimit
     */
    public Integer getTimeLimit() {
        return this.timeLimit;
    }

    public static final class Builder extends Request.Builder {
        private String project; 
        private Integer route; 
        private String sourceIp; 
        private Integer timeLimit; 

        /**
         * <p>Project.</p>
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>Route.</p>
         */
        public Builder route(Integer route) {
            this.putQueryParameter("Route", route);
            this.route = route;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>TimeLimit.</p>
         */
        public Builder timeLimit(Integer timeLimit) {
            this.putQueryParameter("TimeLimit", timeLimit);
            this.timeLimit = timeLimit;
            return this;
        }

        public ModifyNoticeConfigRequest build() {
            return new ModifyNoticeConfigRequest(this);
        } 

    } 

}
