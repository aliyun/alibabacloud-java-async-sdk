// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ReplicationProgressRule} extends {@link TeaModel}
 *
 * <p>ReplicationProgressRule</p>
 */
public class ReplicationProgressRule extends TeaModel {
    @NameInMap("Action")
    private String action;

    @NameInMap("Destination")
    private ReplicationDestination destination;

    @NameInMap("HistoricalObjectReplication")
    private String historicalObjectReplication;

    @NameInMap("ID")
    private String id;

    @NameInMap("PrefixSet")
    private ReplicationPrefixSet prefixSet;

    @NameInMap("Progress")
    private Progress progress;

    @NameInMap("Status")
    private String status;

    private ReplicationProgressRule(Builder builder) {
        this.action = builder.action;
        this.destination = builder.destination;
        this.historicalObjectReplication = builder.historicalObjectReplication;
        this.id = builder.id;
        this.prefixSet = builder.prefixSet;
        this.progress = builder.progress;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationProgressRule create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return destination
     */
    public ReplicationDestination getDestination() {
        return this.destination;
    }

    /**
     * @return historicalObjectReplication
     */
    public String getHistoricalObjectReplication() {
        return this.historicalObjectReplication;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return prefixSet
     */
    public ReplicationPrefixSet getPrefixSet() {
        return this.prefixSet;
    }

    /**
     * @return progress
     */
    public Progress getProgress() {
        return this.progress;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String action; 
        private ReplicationDestination destination; 
        private String historicalObjectReplication; 
        private String id; 
        private ReplicationPrefixSet prefixSet; 
        private Progress progress; 
        private String status; 

        /**
         * A short description of action
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Destination.
         */
        public Builder destination(ReplicationDestination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * A short description of HistoricalObjectReplication
         */
        public Builder historicalObjectReplication(String historicalObjectReplication) {
            this.historicalObjectReplication = historicalObjectReplication;
            return this;
        }

        /**
         * rule id
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * PrefixSet.
         */
        public Builder prefixSet(ReplicationPrefixSet prefixSet) {
            this.prefixSet = prefixSet;
            return this;
        }

        /**
         * A short description of Progress
         */
        public Builder progress(Progress progress) {
            this.progress = progress;
            return this;
        }

        /**
         * A short description of action
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ReplicationProgressRule build() {
            return new ReplicationProgressRule(this);
        } 

    } 

    public static class Progress extends TeaModel {
        @NameInMap("HistoricalObject")
        private String historicalObject;

        @NameInMap("NewObject")
        private String newObject;

        private Progress(Builder builder) {
            this.historicalObject = builder.historicalObject;
            this.newObject = builder.newObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Progress create() {
            return builder().build();
        }

        /**
         * @return historicalObject
         */
        public String getHistoricalObject() {
            return this.historicalObject;
        }

        /**
         * @return newObject
         */
        public String getNewObject() {
            return this.newObject;
        }

        public static final class Builder {
            private String historicalObject; 
            private String newObject; 

            /**
             * A short description of HistoricalObject
             */
            public Builder historicalObject(String historicalObject) {
                this.historicalObject = historicalObject;
                return this;
            }

            /**
             * A short description of NewObject
             */
            public Builder newObject(String newObject) {
                this.newObject = newObject;
                return this;
            }

            public Progress build() {
                return new Progress(this);
            } 

        } 

    }
}
